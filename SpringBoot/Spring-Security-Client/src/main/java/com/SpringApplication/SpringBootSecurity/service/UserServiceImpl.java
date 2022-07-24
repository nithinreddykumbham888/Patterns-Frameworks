package com.SpringApplication.SpringBootSecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringApplication.SpringBootSecurity.entity.User;
import com.SpringApplication.SpringBootSecurity.model.UserModel;
import com.SpringApplication.SpringBootSecurity.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServive {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUserDetails() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

//	@Override
//	public User registerUser(UserModel userModel) {
//		User user = new User();
//		user.setFirstName(userModel.getFirstName());
//		user.setLastName(userModel.getLastName());
//		user.setEmail(userModel.getEmail());
//		user.setPassword(userModel.getPassword());
//		return userRepository.sav;
//	}
	

}
