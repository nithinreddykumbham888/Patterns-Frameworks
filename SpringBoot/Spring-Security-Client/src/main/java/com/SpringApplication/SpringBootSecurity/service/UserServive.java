package com.SpringApplication.SpringBootSecurity.service;

import java.util.List;

import com.SpringApplication.SpringBootSecurity.entity.User;
import com.SpringApplication.SpringBootSecurity.model.UserModel;

public interface UserServive {

	User saveUser(User user);

	List<User> getAllUserDetails();

//	User registerUser(UserModel userModel);

}
