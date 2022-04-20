package com.SpringApplication.DiningDemo;

import org.springframework.stereotype.Component;

@Component
public class PeopleFactory {

	public People getPeople(String name) {
		if(name.equalsIgnoreCase("Student")) {
			return new Student();
		}
		else if(name.equalsIgnoreCase("Faculty")) {
			return new Faculty();
		}
		else if(name.equalsIgnoreCase("Staff")) {
			return new Staff();
		}
		else{
			return null;
		}
	}
}
