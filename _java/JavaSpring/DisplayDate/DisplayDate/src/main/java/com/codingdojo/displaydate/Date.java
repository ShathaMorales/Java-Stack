package com.codingdojo.displaydate;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Date {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat simpleDate = new SimpleDateFormat("EEEE, MMM d, YYYY");
		java.util.Date date = new java.util.Date();
		model.addAttribute("date", simpleDate.format(date));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat simpleDate = new SimpleDateFormat("h:mm a");
		java.util.Date date = new java.util.Date();
		model.addAttribute("time", simpleDate.format(date));
		return "time.jsp";
	}
	
}
