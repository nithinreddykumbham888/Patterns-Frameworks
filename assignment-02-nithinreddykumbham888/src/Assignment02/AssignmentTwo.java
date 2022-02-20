package Assignment02;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("*****Problem 01*****");
		 System.out.println("Enter number of elements : ");
	        int choice = scan.nextInt();
	        System.out.println("Enter elements with space : ");
	        ArrayList<String> array = new ArrayList<>();
	        //String[] array = new String[choice];
	        for(int i=0;i<choice;i++) {
	        	array.add(scan.next());
	        } 
	        Problem01 p1=new Problem01();
	        System.out.println(p1.occurance(array));

	        System.out.println("\n");
	        System.out.println("*****Problem 02*****");
	        System.out.println("Enter elements of choice(int) : ");
	        int choice5 = scan.nextInt();
	        String[] S11 = new String[choice5];
	        System.out.println("Enter elements with space : ");
	        for(int i=0;i<choice5;i++) {
	        	S11[i] = scan.next();
	        }
	        Problem02 test7 = new Problem02();
	        Map<String,String> output7 = test7.concatString(S11);
	        System.out.println(output7);
	        
	        
	        System.out.println("\n");
	        System.out.println("*****Problem 03*****");
	        System.out.println("Enter your choice of elements(int) : ");
	        int choice3 = scan.nextInt();
	        System.out.println("Enter elements with space : ");
	        int[] A2 = new int[choice3];
	        for(int i=0;i<choice3;i++) {
	        	A2[i] = scan.nextInt();
	        }
	        Problem03 test2 = new Problem03();
	        Set<Integer> output2 = test2.sequential(A2);
	        System.out.println(output2);
	        
	        
	        System.out.println("\n");
	        System.out.println("*****Problem 04*****");
	        System.out.println("Enter number of elements : ");
	        int choice1 = scan.nextInt();
	        System.out.println("Enter elements with space : ");
	        ArrayList<String> A1 = new ArrayList<>();
	        while(choice1>0) {
	        	A1.add(scan.next());
	        	choice1--;
	        }
	        Problem04 test = new Problem04();
	        ArrayList<String> output = test.removeDuplicates(A1);
	        System.out.println(output);
	        
	        System.out.println("\n");
	        System.out.println("*****Problem 05*****");
	        System.out.println("Enter elements of choice(int) : ");
	        ArrayList<String> A = new ArrayList<>();
	        int choice4 = scan.nextInt();
	        System.out.println("Enter elements with space : ");
	        while(choice4>0) {
	        	A.add(scan.next());
	        	choice4--;
	        }
	        Problem05 test3 = new Problem05();
	        Map<String, String> output3 = test3.firstLast(A);
	        System.out.println(output3);
	        
	        
	        System.out.println("\n");
	        System.out.println("*****Problem 06*****");
	        System.out.println("Enter your choice of elements(int) : ");
	        int choice2 = scan.nextInt();
	        ArrayList<String> S1 = new ArrayList<>();
	        System.out.println("Enter elements with space : ");
	        while(choice2>0) {
	        	S1.add(scan.next());
	        	choice2--;
	        }
	        Problem06 test1 = new Problem06();
	        Map<String,Boolean> output1 = test1.appearCheck(S1);
	        System.out.println(output1);
	}

}
