package com.codingdojo.travels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.travels.models.Travel;
import com.codingdojo.travels.services.TravelService;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

//..

@Controller
public class TravelApi {
 private final TravelService travelService;
 public TravelApi(TravelService travelService){
     this.travelService = travelService;
 }
 
 @GetMapping("/expenses")
 public String newTravel(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
	 List<Travel> travels = travelService.allTravels();
	 model.addAttribute("travels", travels);
     return "index.jsp";
 }
 
 @RequestMapping("/api/books")
 public List<Travel> index() {
     return travelService.allTravels();
 }
 
 @PostMapping(value="/travel")
 public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
	 if (result.hasErrors()) {
         return "index.jsp";
     } else {
         travelService.createTravel(travel);
         return "redirect:/expenses";
     }
 }
 
// @GetMapping("/show")
// public String show(Model model){
//	 List<Travel> travel = travelService.allTravels();
//	 model.addAttribute("travels", travel);
//	 return "redirect:/expenses";
// }
 
 
 @RequestMapping("/api/books/{id}")
 public Travel show(@PathVariable("id") Long id) {
     Travel book = travelService.findTravel(id);
     return book;
 }
}