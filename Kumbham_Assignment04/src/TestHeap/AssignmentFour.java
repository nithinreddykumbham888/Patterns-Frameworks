package TestHeap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AssignmentFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("****************Problem01******************");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter elements of choice in int : ");
        int choice1 = scan.nextInt();
        int testOutput1 = choice1;
        MinHeap P1 = new MinHeap();
        System.out.println("Enter elements with space : ");
        while(choice1>0) {
        	P1.insert(scan.nextInt());
        	choice1--;
        }
        if(testOutput1>=2) {
        	ArrayList<Integer> result1 = P1.getElements();
            System.out.println(result1.get(1));
        } 

        /**
         * Another method
         * System.out.println(P1.delete());
           System.out.println(P1.delete());
           for(int i=(result.size()/2);i<result.size();i++) {    //getting leaf elements 10 14 19 26 31 42 27 44 35 33
        	System.out.print(result.get(i)+" ");
        }
         */
        
        System.out.println("\n****************Problem02******************");
        System.out.println("Enter elements of choice in int : ");
        int choice2 = scan.nextInt();
        int testOutput2 = choice2;
        MinHeap P2 = new MinHeap();
        System.out.println("Enter elements with space : ");
        while(choice2>0) {
        	P2.insert(scan.nextInt());
        	choice2--;
        }
        if(testOutput2>0) {
        	ArrayList<Integer> result2 = P2.getElements();
            System.out.println(Collections.min(result2));
        }
        
        System.out.println("\n****************Problem03******************");
        System.out.println("Enter elements of choice in int : ");
        int choice3 = scan.nextInt();
        int testOutput3 = choice3;
        MinHeap P3 = new MinHeap();
        System.out.println("Enter elements with space : ");
        while(choice3>0) {
        	P3.insert(scan.nextInt());
        	choice3--;
        }
        if(testOutput3>0) {
        	ArrayList<Integer> result3 = P3.getElements();
            System.out.println(Collections.min(result3) + Collections.max(result3));
        }
        
        System.out.println("\n****************Problem04******************");
        System.out.println("Enter elements of choice in int : ");
        int choice4 = scan.nextInt();
        int testOutput4 = choice4;
        MinHeap P4 = new MinHeap();
        System.out.println("Enter elements with space : ");
        while(choice4>0) {
        	P4.insert(scan.nextInt());
        	choice4--;
        }
        if(testOutput4>0) {
        	ArrayList<Integer> result4 = P4.getElements();
        	Collections.sort(result4, Collections.reverseOrder());
        	System.out.println(result4.get(1));
        }
	}

}
