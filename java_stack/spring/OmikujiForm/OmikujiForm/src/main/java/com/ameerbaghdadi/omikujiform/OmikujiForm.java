package com.ameerbaghdadi.omikujiform;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiForm {
	@RequestMapping("/")
	public String def() {
		return "Form.jsp";
	}
	
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String index(Model model,
		@RequestParam(value="number") int number,
		@RequestParam(value="city") String city,
		@RequestParam(value="person") String person,
		@RequestParam(value="hoppy") String hoppy,
		@RequestParam(value="living") String living,
		@RequestParam(value="nice") String nice, HttpSession session) {
				
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hoppy", hoppy);
		session.setAttribute("living", living);
		session.setAttribute("nice", nice);
		
		return "redirect:/show";
	}
		
	@RequestMapping(value="/show")
	public String show(Model model, HttpSession session) {
		model.addAttribute("number", session.getAttribute("number"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("person", session.getAttribute("person"));
		model.addAttribute("hoppy", session.getAttribute("hoppy"));
		model.addAttribute("living", session.getAttribute("living"));
		model.addAttribute("nice", session.getAttribute("nice"));
			
		return "Show.jsp";
	}
			
}
