package com.SpringApplication.DiningDemo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;





@SpringBootApplication
public class DiningDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(DiningDemoApplication.class, args);
		try (Scanner scan = new Scanner(System.in)) {
			   //appContext.getBean(Dog.class);
			System.out.println("Enter name : ");
			String name = scan.next();
			PeopleFactory factory = appContext.getBean(PeopleFactory.class);
			People enteredName = factory.getPeople(name);
			
				//People s = (People) enteredName; 
				enteredName.buyFood();
				double total = enteredName.getTotal();
				double total1 = enteredName.buyBook();
				double finalTotal = total + total1;
				System.out.println("Total price for Student is : " + finalTotal);
				
			
		
	}
		catch(Exception e){
			System.out.println("Incorrect name");
		}
}
}
