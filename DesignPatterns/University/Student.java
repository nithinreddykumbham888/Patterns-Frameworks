package DesignPatterns.University;

import java.util.Scanner;

public class Student implements People {

	private String name;
	private double total;
	
	public Student() {
		this.name = name;
		this.total = total;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotal() {
		return total;
	}
	
	
	@Override
	public void buyFood() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of food items");
		int choice = scan.nextInt();
		while(choice>0) {
			System.out.println("Enter item name");
			String name = scan.next();
			System.out.println("Enter price for item");
			double price = scan.nextDouble();
			total = total + price;
			choice--;
		}
		
	}

	@Override
	public double buyBook() {
		// TODO Auto-generated method stub
		double total1 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of books to buy : ");
		int choice = scan.nextInt();
		while(choice>0) {
			System.out.println("Enter book name");
			String name = scan.next();
			System.out.println("Enter price for book");
			double price = scan.nextDouble();
			total1 = total1 + price;
			choice--;
		}
		return total1;
	}
	

}
