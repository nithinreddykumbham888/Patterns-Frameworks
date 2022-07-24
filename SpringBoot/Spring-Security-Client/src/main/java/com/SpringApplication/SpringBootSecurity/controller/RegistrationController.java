package com.SpringApplication.SpringBootSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringApplication.SpringBootSecurity.entity.User;
import com.SpringApplication.SpringBootSecurity.model.UserModel;
import com.SpringApplication.SpringBootSecurity.service.UserServive;

@RestController
public class RegistrationController {
	
	@Autowired
	private UserServive userService;
	
//	@PostMapping("/registeruser")
//	public String registerUser(@RequestBody UserModel userModel) {
//		User user = userService.registerUser(userModel);
//	}
	
    @PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
    @GetMapping("/getUsers")
	public List<User> getAllUserDetails(){
		return userService.getAllUserDetails();
	}
}
