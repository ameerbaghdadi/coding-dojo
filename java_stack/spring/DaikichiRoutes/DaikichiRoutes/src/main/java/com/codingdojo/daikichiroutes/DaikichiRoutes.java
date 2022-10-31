package com.codingdojo.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiRoutes {
		@RequestMapping("/daikichi")
		public String Welcome() {
			return "Welcome!";
		}
	
		@RequestMapping("/daikichi/today")
		public String Today() {
			return "Today you will find luck in all your endeavors!";
		}
		
		@RequestMapping("/daikichi/tomorrow")
		public String Tomorrow() {
			return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
		}
}
