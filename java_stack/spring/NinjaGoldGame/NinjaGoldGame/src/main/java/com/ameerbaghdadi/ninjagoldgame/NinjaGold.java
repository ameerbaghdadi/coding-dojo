package com.ameerbaghdadi.ninjagoldgame;

import java.util.ArrayList;
import java.util.Random;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGold {
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
			return "index.jsp";
	}
	
	@PostMapping("/process_money")
	public String money(HttpSession session,
		@RequestParam(value="place") String location) {
		if (location.equals("farm")){
			Random randomFarm = new Random();
			if (session.getAttribute("farm") == null) {
				session.setAttribute("farm", randomFarm.nextInt(20-10)+10);
			}
			else {
				session.setAttribute("farm", randomFarm.nextInt(20-10)+10);
				Integer add = (Integer) session.getAttribute("count") + (Integer) session.getAttribute("farm");
				session.setAttribute("count", add);
			}
		}
		else if(location.equals("cave")) {
			Random randomFarm = new Random();
			if (session.getAttribute("farm") == null) {
				session.setAttribute("farm", randomFarm.nextInt(20-10)+10);
			}
			else {
				session.setAttribute("farm", randomFarm.nextInt(20-10)+10);
				Integer add = (Integer) session.getAttribute("count") + (Integer) session.getAttribute("farm");
				session.setAttribute("count", add);
			}
		}
		else if(location.equals("house")) {
			Random randomHouse = new Random();
			if (session.getAttribute("house") == null) {
				session.setAttribute("house", randomHouse.nextInt(20-10)+10);
			}
			else {
				session.setAttribute("house", randomHouse.nextInt(20-10)+10);
				Integer add = (Integer) session.getAttribute("count") + (Integer) session.getAttribute("house");
				session.setAttribute("count", add);
			}
		}
		else if(location.equals("quest")) {
			Random randomQuest = new Random();
			if (session.getAttribute("quest") == null) {
				session.setAttribute("quest", randomQuest.nextInt(20-10)+10);
			}
			else {
				session.setAttribute("quest", randomQuest.nextInt(50+50)-50);
				Integer add = (Integer) session.getAttribute("count") + (Integer) session.getAttribute("quest");
				session.setAttribute("count", add);
			}
		}
		return "redirect:/";
	}
}
