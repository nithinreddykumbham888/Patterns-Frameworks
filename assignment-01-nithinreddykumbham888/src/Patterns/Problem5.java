package Patterns;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Problem5 {
	
	public void pairOfBrackets(char arr[]) {
		int sizeS = arr.length;
		Deque<Character> S1 = new ArrayDeque<>();
		Stack<Character> S2 = new Stack<>();
		String s =" ";
		//System.out.println(sizeS);
//		for(int i=0;i<sizeS;i++) {
//		System.out.print(" "+arr[i]);
//	}
		if(sizeS % 2 != 0 || sizeS == 0) {
			System.out.println("False");
		}
		else {
			for(int i=0;i<sizeS;i++) {
				if(arr[i] =='{' || arr[i] == '(' || arr[i] == '[') {
				S1.push(arr[i]);
				continue;
			}
				//System.out.println("hello "+S1);
			if (S1.isEmpty()) {             
				System.out.println("False");
			}
			char checkStatement;
			switch(arr[i]) {
			case '}' :
				checkStatement = S1.pop();
				//System.out.println("1 :"+checkStatement);
				 if (checkStatement == '(' || checkStatement == '[') {
                   System.out.println("False");
				 }
                   break;
                   
			case ')' :
				checkStatement = S1.pop();
				//System.out.println("2 :"+checkStatement);
				 if (checkStatement == '{' || checkStatement == '[') {
                   System.out.println("False");
				 }
                   break;
                   
			case ']' :
				checkStatement = S1.pop();
				//System.out.println("3 :"+checkStatement);
				 if (checkStatement == '{' || checkStatement == '(') {
                   System.out.println("False");
				 }
                   break;
			}
		}
			//System.out.println(S1);
			boolean output = S1.isEmpty();
			System.out.println(output);
	  }
//		if (S1.isEmpty()) {             
//			System.out.println("False");
//		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//ArrayList<Character> A1 = new ArrayList<>();
		System.out.println("Enter string of brackets");
		String brackets = scan.next();
		char[] arr = brackets.toCharArray();
		
		Problem5 objList = new Problem5();
		objList.pairOfBrackets(arr);
	}
}

	
