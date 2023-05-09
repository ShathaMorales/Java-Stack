package com.codingdojo.savetravels.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.savetravels.models.Expense;
import com.codingdojo.savetravels.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class ExpenseController {
    private final ExpenseService expenseService;
    
    public ExpenseController (ExpenseService expenseService){
        this.expenseService = expenseService;
    }  

    @RequestMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
    
    @GetMapping("/expenses")
    public String newExpense(@ModelAttribute("expense") Expense expense, Model model) {
    	List<Expense> allexpenses = expenseService.allExpenses();
        model.addAttribute("allexpenses", allexpenses);
             return "index.jsp";
        }
    
    @PostMapping("/handle")
    public String addExpense(@Valid @ModelAttribute("expense") Expense expense, 
    		BindingResult result, Model model) {
    	if (result.hasErrors()) {
        	List<Expense> allexpenses = expenseService.allExpenses();
            model.addAttribute("allexpenses", allexpenses);          
        	return "index.jsp";
        } else {
        	expenseService.addExpense(expense);
            return "redirect:/";
        }
    }
    
		@RequestMapping("/expenses/{id}")
		public String displayExpense(@PathVariable("id") Long id, 
				@ModelAttribute ("expense") Expense expense, Model model) {
			model.addAttribute("expense", expenseService.findExpense(id));
			return "display.jsp";
		}

        @RequestMapping("/expenses/edit/{id}")
        public String editExpense(@PathVariable("id") Long id, 
        		@ModelAttribute ("expense") Expense expense, Model model) {
            model.addAttribute("expense", expenseService.findExpense(id));
            return "edit.jsp";
        }
        
        
        @RequestMapping(value="expenses/edit/{id}", method=RequestMethod.PUT)
        public String updateExpense(@Valid @ModelAttribute("expense") Expense expense, 
        		BindingResult result, @PathVariable("id") Long id, Model model) {
            if (result.hasErrors()) {
                model.addAttribute("expense", expense);
                return "edit.jsp";
            } else {
            	expenseService.updateExpense(expense);
                return "redirect:/";
            }
        }
        
        @DeleteMapping("/delete/{id}")
        public String destroy(@PathVariable("id") Long id) {
            expenseService.deleteExpense(id);
            return "redirect:/";
        }
        
}
