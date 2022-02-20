package Patterns;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Problem10 {
	
	public void insertDelete(Deque<Character> D, int[] array2) {
		final int sizeS = D.size();
		char[] array3 = new char[sizeS];
		int sizeS1 = array2.length;
		if(sizeS > 0) {
		for(int i=0;i<sizeS1;i++) {
			if(array2[i] == 1) {
			   array3[i] = D.removeFirst();
			   if(array2.length-1>i) {
			   if(array2[i+1] == 0) {
				   D.addFirst(array3[i]);
			   }
			    }
			}
			
		}
	  }
		System.out.println(D);
//		char[] array4 = new char[sizeS];
//		for(int i=0;i<sizeS;i++) {
//			array4[i] = D.add([i]);
//		}
//		System.out.println("2 : "+D);
//		for(int i=0;i<array4.length;i++) {
//			System.out.print(array4[i]);
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Deque<Character> D = new ArrayDeque<>();
		System.out.println("Enter a string to start : ");
		String choice = scan.next();
        //System.out.println(sizeS);
        char[] array1 = choice.toCharArray();
        for(int i=0;i<array1.length;i++) {
        	D.add(array1[i]);
        }
        //System.out.println(D);
        System.out.println("Enter array of length in int: ");
        int choice1 = scan.nextInt();
        int[] array2 = new int[choice1];
        System.out.println("Enter binary number(0 or 1) to proceed with space: ");
        for(int i=0;i<choice1;i++) {
        	array2[i] = scan.nextInt();
        }
        Problem10 test = new Problem10();
        test.insertDelete(D,array2);
	}

}
