package com.SpringApplication.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String welcomeMessage() {
		return "Welcome to spring boot demo!!";
	}

}
