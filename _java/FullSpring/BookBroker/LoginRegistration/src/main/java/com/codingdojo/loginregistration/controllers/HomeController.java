package com.codingdojo.loginregistration.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.loginregistration.models.Book;
import com.codingdojo.loginregistration.models.LoginUser;
import com.codingdojo.loginregistration.models.User;
import com.codingdojo.loginregistration.services.BookService;
import com.codingdojo.loginregistration.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
    
    // Add once service is implemented
    @Autowired
    private UserService userServ;
    
    @Autowired
    private BookService bookService;
    
    @GetMapping("/")
    public String index(Model model) {
    
        // Bind empty User and LoginUser objects to the JSP
        // to capture the form input
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        // Call a register method in the service 
        // to do some extra validations and create a new user!
    	userServ.register(newUser, result);        
        if(result.hasErrors()) {
            // Send in the empty LoginUser before 
            // re-rendering the page.
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        // No errors! 
        // Store their ID from the DB in session, 
        // in other words, log them in
        session.setAttribute("user_id", newUser.getId());
        session.setAttribute("userName", newUser.getUserName());
        return "redirect:/books";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        // Add once service is implemented
        User user = userServ.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        // No errors! 
        // Store their ID from the DB in session, 
        // in other words, log them in.
        session.setAttribute("user_id", user.getId());
        session.setAttribute("userName", user.getUserName());
        return "redirect:/books";
    }


	@GetMapping("/books")
	public String Dashboard (Model model, HttpSession session) {
		if (session.getAttribute("user_id") != null) {
			List <Book> books  = bookService.allBooks();
			model.addAttribute("books", books);
			return "home.jsp";
		}else {
			return "redirect:/";
		}
		
	}
		
	@GetMapping("/books/new")
	public String newForm(@ModelAttribute("book") Book book, HttpSession session, Model model) {
		if (session.getAttribute("user_id") != null) {
			model.addAttribute("user", session.getAttribute("user_id"));
			return "BookForm.jsp";
		}
		else {
			return "redirect:/";
		}
		
	}

	@PostMapping("/books/new")
	public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session, Model model) {
		if (session.getAttribute("user_id") != null) {
			if (result.hasErrors()) {
				model.addAttribute("user", session.getAttribute("user_id"));
				return "BookForm.jsp";
			}else {
				bookService.addBook(book);
				return "redirect:/books";
			}
		}
		else {
			return "redirect:/";
		}		
	}
	
	@GetMapping("/books/{bookId}")
	public String ShowBook (@PathVariable("bookId") Long id, Model model, HttpSession session) {
		if (session.getAttribute("user_id") != null) {
			model.addAttribute("user", session.getAttribute("user_id"));
			Book thisBook = bookService.findBook(id);
			model.addAttribute("book", thisBook);
			if (session.getAttribute("user_id").equals(thisBook.getUser().getId())) {
				model.addAttribute("name1", "You");
				model.addAttribute("name2", "your");
				session.setAttribute("edit", session.getAttribute("user"));
			}
			else {
				model.addAttribute("name1", thisBook.getUser().getUserName());
				model.addAttribute("name2", thisBook.getUser().getUserName() + "'s");
			}
			return "BookDisplay.jsp";
		}else {
			return "redirect:/";
		}
	}
	 
	@GetMapping("/books/{bookId}/edit")
	public String editForm(@PathVariable("bookId") Long id, HttpSession session, Model model) {
		if (session.getAttribute("user_id") != null) {
			model.addAttribute("user", session.getAttribute("user_id"));
			Book thisBook = bookService.findBook(id);
			model.addAttribute("book", thisBook);
			return "BookEdit.jsp";
		}
		else {
			return "redirect:/";
		}
		
	}
	
	@PutMapping("/books/{id}/edit")
    public String updateBook (@Valid @ModelAttribute("book") Book book, BindingResult result,@PathVariable("id") Long id,Model model,HttpSession session) {
        if (session.getAttribute("user_id") != null) {
            if (result.hasErrors()) {
                model.addAttribute("user", session.getAttribute("user_id"));
                return "BookEdit.jsp";
            }else {
                bookService.updateBook(book);
                return "redirect:/books/"+id;
            }
        }
        else {
            return "redirect:/";
        }
	
	}
	
	@DeleteMapping("/books/{id}/delete")
	public String deleteBook(@PathVariable("id") Long id, HttpSession session) {
		Book thisBook = bookService.findBook(id);
		if (!session.getAttribute("user_id").equals(thisBook.getUser().getId())) {
			return "redirect:/books/{id}";
		} else {
			bookService.deleteBook(id);
			return "redirect:/books";
		}		
	}
	
    @GetMapping("/books/{id}/borrow")
    public String borrowBook(@PathVariable("id") Long id, HttpSession session) {
    	if(session.getAttribute("user_id") == null) {
    		return "redirect:/";
    	}
    	Book book = bookService.findBook(id);
    	book.setBorrower(userServ.findUserById((Long)session.getAttribute("user_id")));
    	bookService.updateBook(book);
    	
    	return "redirect:/books";
    }
    
    @GetMapping("/books/{id}/return")
    public String returnBook(@PathVariable("id") Long id, HttpSession session) {
    	if(session.getAttribute("user_id") == null) {
    		return "redirect:/";
    	}
    	Book book = bookService.findBook(id);
    	book.setBorrower(null);
    	bookService.updateBook(book);
    	
    	return "redirect:/books";
    }
		
	 @GetMapping("/logout")
	 public String logout(HttpSession session) { 
	         session.invalidate();
	         return "redirect:/";
	        
	 }
	    	 
	 
}