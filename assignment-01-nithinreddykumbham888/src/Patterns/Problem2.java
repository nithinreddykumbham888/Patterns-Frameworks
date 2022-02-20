package Patterns;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
	
	public void arrangePairs(LinkedList<Integer>L1, int number) {
		int sizeS = L1.size();
		//System.out.println(sizeS);
		LinkedList<List<Integer>> L2 = new LinkedList<List<Integer>>();
		for(int i=0;i<sizeS-1;i++) {
			//for(int j=i+1;j<sizeS;j++) {
				if((L1.get(i) + L1.get(i+1)) == number) {
					LinkedList<Integer> L3 = new LinkedList<>();
					L3.add(L1.get(i));
					L3.add(L1.get(i+1));
					L2.add(L3);
				}
			//} && i<sizeS-1
		}
		System.out.println(L2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       LinkedList<Integer> L1 = new LinkedList<>();
       System.out.println("Enter number of elements to be entered in linked list as int : ");
       int choice = scan.nextInt();
       System.out.println("Enter elements with space : ");
       while(choice>0) {
    	   L1.add(scan.nextInt());
    	   choice--;
       }
       System.out.println("Enter a number to proceed : ");
       int number = scan.nextInt();
       Problem2 test = new Problem2();
       test.arrangePairs(L1,number);
	}

}
