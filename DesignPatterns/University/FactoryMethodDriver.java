package DesignPatterns.University;

import java.util.Scanner;

import DesignPattern.Shape.Circle;
import DesignPattern.Shape.Rectangle;
import DesignPattern.Shape.Shape;
import DesignPattern.Shape.ShapeFactory;
import DesignPattern.Shape.Square;

public class FactoryMethodDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			PeopleFactory factory = new PeopleFactory();
			System.out.println("Enter name : ");
			String name = scan.next();
			People enteredName = factory.getPeople(name);

			if (enteredName instanceof Student) {
				People s = (People) enteredName; 
				s.buyFood();
				double total = s.getTotal();
				double total1 = s.buyBook();
				double finalTotal = total + total1;
				System.out.println("Total price for Student is : " + finalTotal);
				
			}
			else if (enteredName instanceof Faculty) {
			Faculty s = (Faculty) enteredName; 
			s.buyFood();
			double total = s.getTotal();
			double total1 = s.buyBook();
			double finalTotal = total + total1;
			System.out.println("Total price for Faculty is : " + finalTotal);
			
		}
			else if (enteredName instanceof Staff) {
			Staff s = (Staff) enteredName; 
			s.buyFood();
			double total = s.getTotal();
			double total1 = s.buyBook();
			double finalTotal = total + total1;
			System.out.println("Total price for Staff is : " + finalTotal);
			
		}
			else {
				System.out.println("Not a correct name!");
			}
		}
	}

}
