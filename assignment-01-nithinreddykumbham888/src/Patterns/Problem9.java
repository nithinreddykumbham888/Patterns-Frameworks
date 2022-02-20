package Patterns;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Problem9 {
	
	public void arrangeSequence(Deque<Integer> Q) {
		int sizeS = Q.size();
		Deque<Integer> odd = new ArrayDeque<>();
		Deque<Integer> even = new ArrayDeque<>();
		Deque<Integer> output = new ArrayDeque<>();
		int[] array = new int[sizeS];
		for(int i=0;i<sizeS;i++) {
			array[i] = Q.poll();
		}
		
		for(int i=0;i<sizeS;i++) {
			if(array[i] % 2 == 0) {
				even.add(array[i]);
			}
			else {
				odd.add(array[i]);
			}
		}
//		System.out.println(odd);
//		System.out.println(even);
		int oddSize = odd.size();
		int evenSize = even.size();
//		System.out.println(oddSize);
//		System.out.println(evenSize);
		for(int i=0;i<sizeS;i++) {
			//System.out.println("count : "+i);
			if(evenSize>0) {
			output.add(even.poll());
			//System.out.println("count1 : "+evenSize);
			evenSize--;
			}
			if(oddSize>0) {
			output.add(odd.poll());
			//System.out.println("count2 : "+oddSize);
			oddSize--;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Deque<Integer> Q = new ArrayDeque<>();
		System.out.println("Enter choice of numbers : ");
		int choice = scan.nextInt();
		System.out.println("Enter elements with space : ");
		while(choice>0) {
			Q.add(scan.nextInt());
			choice--;
		}
        
		Problem9 test = new Problem9();
		test.arrangeSequence(Q);
	}

}
