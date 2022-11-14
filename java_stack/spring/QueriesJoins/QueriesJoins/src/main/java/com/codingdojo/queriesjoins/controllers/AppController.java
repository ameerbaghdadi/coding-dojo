package com.codingdojo.queriesjoins.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.queriesjoins.models.Country;
import com.codingdojo.queriesjoins.services.AppService;

@Controller
public class AppController {
	
	 @Autowired
	    private AppService appService;
	 
	 @GetMapping("/app")
	    public String index(Model model) {
		 List<Object[]> one = appService.one();
	        model.addAttribute("one", one);
	        List<Object[]> tow = appService.tow();
	        model.addAttribute("tow", tow);
	        List<Object[]> three = appService.three();
	        model.addAttribute("three", three);
	        List<Object[]> four = appService.four();
	        model.addAttribute("four", four);
	        List<Object[]> five = appService.five();
	        model.addAttribute("five", five);
	        List<Object[]> six = appService.six();
	        model.addAttribute("six", six);
	        List<Object[]> seven = appService.seven();
	        model.addAttribute("seven", seven);
	        List<Object[]> eight = appService.eight();
	        model.addAttribute("eight", eight);
	        
	        return "index.jsp";
	 }
	 
	 @GetMapping("/one")
	    public String one(Model model) {
	        List<Object[]> one = appService.one();
	        model.addAttribute("one", one);
	        
	        return "index.jsp";
	 }
	
	 @GetMapping("/tow")
	    public String tow(Model model) {
	        List<Object[]> tow = appService.tow();
	        model.addAttribute("tow", tow);
	        
	        return "index.jsp";
	 }
 
	 @GetMapping("/three")
	    public String three(Model model) {
	        List<Object[]> three = appService.three();
	        model.addAttribute("three", three);
	        
	        return "index.jsp";
	 }
	 
	 
	 @GetMapping("/four")
	    public String four(Model model) {
	        List<Object[]> four = appService.four();
	        model.addAttribute("four", four);
	        
	        return "index.jsp";
	 }
	 
	 @GetMapping("/five")
	    public String five(Model model) {
	        List<Object[]> five = appService.five();
	        model.addAttribute("five", five);
	        
	        return "index.jsp";
	 }
	 
	 @GetMapping("/six")
	    public String six(Model model) {
	        List<Object[]> six = appService.six();
	        model.addAttribute("six", six);
	        
	        return "index.jsp";
	 }
	 
	 @GetMapping("/seven")
	    public String seven(Model model) {
	        List<Object[]> seven = appService.seven();
	        model.addAttribute("seven", seven);
	        
	        return "index.jsp";
	 }
	 
	 @GetMapping("/eight")
	    public String eight(Model model) {
	        List<Object[]> eight = appService.eight();
	        model.addAttribute("eight", eight);
	        
	        return "index.jsp";
	 }

}
