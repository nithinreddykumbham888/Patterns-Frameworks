package DesignPatterns.Ipl;

import java.util.Scanner;


public class FactoryMethodDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			TeamFactory factory = new TeamFactory();
			System.out.println("Enter team name : ");
			String name = scan.next();
			Team enteredName = factory.getTeam(name);

			if (enteredName instanceof RCB) {
				Team s = (Team) enteredName; 
				double total = s.buyPlayers();
				System.out.println("Players value for team " +name+ " is "+total);
				int total1 = s.playMatch();
				System.out.println("Total score is "+total1);
				int total3 = s.totalMatchesWon();
				System.out.println("Total points for team " +name+ " is "+total3);
			}
			
			else if (enteredName instanceof SRH) {
				Team s = (Team) enteredName; 
				double total = s.buyPlayers();
				System.out.println("Players value for team " +name+ " is "+total);
				int total1 = s.playMatch();
				System.out.println("Total score is "+total1);
				int total3 = s.totalMatchesWon();
				System.out.println("Total points for team " +name+ " is "+total3);
			}
			
			else if (enteredName instanceof DC) {
				Team s = (Team) enteredName; 
				double total = s.buyPlayers();
				System.out.println("Players value for team " +name+ " is "+total);
				int total1 = s.playMatch();
				System.out.println("Total score is "+total1);
				int total3 = s.totalMatchesWon();
				System.out.println("Total points for team " +name+ " is "+total3);
			}
			
			else {
				System.out.println("Not a correct name!");
			}
		}
	}

}
