package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	@RequestMapping("/")
	public String Hello() {
		return "Hello Human";
	}
	
	@RequestMapping("/hello")
	public String Index(@RequestParam(value = "name") String yourName, @RequestParam(value = "last_name", required = false) String yourLastName)  {
		
		return "Hello" +" "+ yourName +" "+ yourLastName;
	}
}