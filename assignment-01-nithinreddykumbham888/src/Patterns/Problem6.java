package Patterns;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Problem6 {
	
	public void sortStack(Stack<Integer> S) {
		int sizeS = S.size();
		int halfSize = sizeS/2;
		//Stack<Integer> S1 = new Stack<Integer>();
		ArrayList<Integer> S1 = new ArrayList<>();
		for(int i=0;i<halfSize;i++) {
			S1.add(S.pop());
		}
		int[] array = new int[halfSize];
		for(int i=array.length-1;i>=0;i--) {
			array[i] = S.pop();
		}
		
		for(int i:array) {
			S1.add(i);
		}
		//		S1.clone();
////		for(int i=0;i<halfSize;i++) {
////			System.out.println(S.);
////		}
////		System.out.println(S);
////		System.out.println(array.length);
		System.out.println(S1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        Stack<Integer> S = new Stack<>();
        System.out.println("Enter even number of choice in int: ");
        int choice = scan.nextInt();
        System.out.println("Enter elements with space : ");
        if(choice % 2 == 0) {
        	while(choice > 0) {
        		S.push(scan.nextInt());
        		choice--;
        	}
        }
        else {
        	System.out.println("Enter even number of integers");
        }
        
        Problem6 test = new Problem6();
        test.sortStack(S);
	}

}
