package com.codingdojo.omikuji;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/omikuji")
public class OmikujiApp {

	@RequestMapping(" ")
	public String index(){
		return "index.jsp";
	}				
	
	@RequestMapping(value="/handle", method=RequestMethod.POST)
	public String handle(
		@RequestParam(value="number") int number,
		@RequestParam(value="city") String city,
		@RequestParam(value="name") String name,
		@RequestParam(value="hobby") String hobby,
		@RequestParam(value="thing") String thing,
		@RequestParam(value="textarea") String textarea,
		HttpSession session) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);	
		session.setAttribute("textarea", textarea);		
		return "redirect:/omikuji/show";
	}

	@RequestMapping("/show")
	public String show() {
		return "show.jsp";
	}
}
