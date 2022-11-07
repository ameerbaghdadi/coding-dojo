package com.codingdojo.ninjadojo.controllers;

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

import com.codingdojo.ninjadojo.models.Dojo;
import com.codingdojo.ninjadojo.models.Ninja;
import com.codingdojo.ninjadojo.services.AppService;

@Controller
public class AppController {
	 private final AppService appService;
	 public AppController(AppService appService){
	     this.appService = appService;
	 }
	 
	 
	 @GetMapping("/dojos/new")
	 public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		 return "newDojo.jsp";
	 }
	 
	 @PostMapping(value="/dojo")
	 public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		 if (result.hasErrors()) {
	         return "newDojo.jsp";
	     } else {
	         appService.createDojo(dojo);
	         return "redirect:/dojos/new";
	     }
	 }
	 
	 @GetMapping("/ninjas/new")
	 public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		 List <Dojo> dojos = appService.allDojos();
		 model.addAttribute("dojos", dojos);
		 return "newNinja.jsp";
	 }
	 
	 @PostMapping(value="/ninja")
	 public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		 if (result.hasErrors()) {
			 model.addAttribute("dojos", appService.allDojos());
	         return "newDojo.jsp";
	     } else {
	         appService.createNinja(ninja);
	         return "redirect:/ninjas/new";
	     }
	 }
	 
	 @RequestMapping("/dojos/{id}")
	 public String show(@PathVariable("id") Long id, Model model) {
	     Dojo dojo = appService.findDojo(id);
	     model.addAttribute("dojos", dojo);
	     return "showDojos.jsp";
	 }
}
