package DesignPatterns.Ipl;

import java.util.Scanner;

public class RCB implements Team {

	String name;
	Scanner scan = new Scanner(System.in);
	
	public RCB() {
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public double buyPlayers() {
		// TODO Auto-generated method stub
		double playersTotal = 0;
		System.out.println("Enter number of Players to be in your team in int : ");
		int count = scan.nextInt();
		while(count>0) {
			System.out.println("Enter price for player" + count + " : ");
			double psTotal = scan.nextDouble();
			playersTotal = playersTotal + psTotal;
			count--;
		}
		return playersTotal;
	}



	@Override
	public int playMatch() {
		// TODO Auto-generated method stub
		int total = 0;
		System.out.println("Let the match start : ");
		System.out.println("Enter number of players to be batted : ");
		int choice = scan.nextInt();
		while(choice>0) {
		System.out.println("Enter score for player" +choice+ " : ");
		int score = scan.nextInt();
		total = total + score;
		choice--;
		}
		return total;
	}


	@Override
	public int totalMatchesWon() {
		// TODO Auto-generated method stub
		int total1 = 1;
		System.out.println("Enter matches won by team : ");
		int matchesWon = scan.nextInt();
		total1 = total1 * (matchesWon * 2);
		return total1;
	}
	
	
}
