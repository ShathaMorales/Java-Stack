package com.codingdojo.renderingbooks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.renderingbooks.services.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/books";
	}
	
	@RequestMapping("/books/{bookId}")
	public String index(Model model, @PathVariable("bookId") Long bookId) {
		model.addAttribute("book", bookService.findBook(bookId));
		return "show.jsp";
	}
	

}