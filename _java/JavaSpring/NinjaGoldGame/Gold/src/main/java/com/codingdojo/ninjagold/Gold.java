package com.codingdojo.ninjagold;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class Gold {

	@RequestMapping("/activities")
	public String activities() {
		return "activities.jsp";
	}
	
	
	@RequestMapping("/")
	public String index ( 
			HttpSession session,
			@RequestParam(value="farm", required=false) String farm,
			@RequestParam(value="cave", required=false) String cave,
			@RequestParam(value="house", required=false) String house,
			@RequestParam(value="quest", required=false) String quest ) {
		Integer count = 0;
		ArrayList<String> activities = new ArrayList<String>();
		SimpleDateFormat simpleFromat = new SimpleDateFormat("MMM, d Y h:mm a");
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", count);
			session.setAttribute("activities", activities);
		} else {
			count = (int) session.getAttribute("count");
			activities = (ArrayList<String>) session.getAttribute("activities");
		}
					
			if (farm != null) {
				int amount = new Random().nextInt(11)+10;
				count+=amount;
				activities.add(0, "You entered a farm and earned "+amount+" gold ("+simpleFromat.format(new Date())+")" );
				session.setAttribute("activities", activities);
				session.setAttribute("count", count);
				return "redirect:/";
			}
			
			if (cave != null) {
				int amount = new Random().nextInt(6)+5;
				count+=amount;
				activities.add(0, "You entered a cave and earned "+amount+" gold ("+simpleFromat.format(new Date())+")" );
				session.setAttribute("activities", activities);
				session.setAttribute("count", count);
				return "redirect:/";
			}
			
			if (house != null) {
				int amount = new Random().nextInt(4)+2;
				count+=amount;
				activities.add(0, "You entered a house and earned "+amount+" gold ("+simpleFromat.format(new Date())+")" );
				session.setAttribute("activities", activities);
				session.setAttribute("count", count);
				return "redirect:/";
			}
			
			if (quest != null) {
				int amount = new Random().nextInt(101)-50;
				count+=amount;
				if (amount>0) {
					activities.add(0, "You entered a quest and earned "+amount+" gold ("+simpleFromat.format(new Date())+")" );
				} else {
					activities.add(0, "You entered a quest and lost "+(amount*-1)+" gold ("+simpleFromat.format(new Date())+")" );
				}
				session.setAttribute("activities", activities);
				session.setAttribute("count", count);
				return "redirect:/";
			}

		return "index.jsp";
	}
}
