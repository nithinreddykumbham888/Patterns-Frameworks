package Patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Problem3 {
	
	public void getMaximumNumber(ArrayList<Integer> A1) {
		int sizeS = A1.size();
        if(sizeS == 0) {
        	System.out.println(Integer.MIN_VALUE);
        }
        int maximum = A1.get(0);
       for(int i=1;i<sizeS;i++) {
    	   if(maximum <= A1.get(i)) {
    		  maximum = A1.get(i);
    	   }
       }
       System.out.println(maximum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> A1 = new ArrayList<>();
		System.out.println("Enter number of elements : ");
		int choice = scan.nextInt();
		System.out.println("Enter number of elements with space : ");
		while(choice>0) {
			A1.add(scan.nextInt());
			choice--;
		}
		//System.out.println(A1);
		Problem3 test = new Problem3();
		test.getMaximumNumber(A1);
	}

}
