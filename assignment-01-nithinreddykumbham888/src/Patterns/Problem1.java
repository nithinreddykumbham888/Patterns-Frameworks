package Patterns;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
	
	public void getPerfectNumber(LinkedList<Integer> l1) {
		//System.out.println(l1);
		List<Integer> l2 = new ArrayList<>(l1); 
		LinkedList<Integer> l3 = new LinkedList<>();
		//System.out.println(l2);
		int sizeS = l2.size();
		int n,r,r1=0;
		for(int i=0;i<sizeS;i++) {
			n = l2.get(i);
			for(int j=1;j<n;j++) {
				r = n%j;
				if(r==0) {
					r1 = r1 + j;
					//System.out.println("value of r is :"+r1);
				}
			}
			//System.out.println("\n");
			if(r1==n) {
				l3.add(n);
			}
			r1=0;
		}
		System.out.println(l3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements as int : ");
		int totalNos = scan.nextInt();
		LinkedList<Integer> l1=new LinkedList<Integer>();
		System.out.println("Enter elements with space : ");
        while(totalNos>0) {
        	l1.add(scan.nextInt());
        	totalNos--;
        }
        Problem1 hello = new Problem1();
        hello.getPerfectNumber(l1);
	}

}
