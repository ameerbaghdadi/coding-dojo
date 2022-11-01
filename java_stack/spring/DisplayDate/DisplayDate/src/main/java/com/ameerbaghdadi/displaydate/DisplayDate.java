package com.ameerbaghdadi.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Controller
public class DisplayDate {
	@RequestMapping("/")
	public String index() {
		return "Index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		LocalDate myDate = LocalDate.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("EEEE, 'the' dd 'of' MMMM, yyyy");
		String dateFormat = myDate.format(myFormatObj);
		model.addAttribute("date", dateFormat);
		return "DateTemplate.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		LocalTime myTime = LocalTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a");
		String timeFormat = myTime.format(myFormatObj);
		model.addAttribute("time", timeFormat);
		return "TimeTemplate.jsp";
	}
}
