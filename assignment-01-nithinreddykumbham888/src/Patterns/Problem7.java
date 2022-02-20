package Patterns;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Problem7 {
	
	public void decimalNumber(Queue<Integer> Q) {
		int sizeS =Q.size();
		int product =0;
		//System.out.println(sizeS);
		for(int i=sizeS-1;i>=0;i--) {
			//System.out.println("element "+Q.poll());
			product = (int) (product + (Math.pow(2,i) * Q.poll()));
		}
		System.out.println(product);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        Queue<Integer> Q = new ArrayDeque<>();
        System.out.println("Enter choice of numbers");
        int choice = scan.nextInt();
        System.out.println("Enter elements with space i.e either 0 or 1");
        while(choice>0) {
        	Q.add(scan.nextInt());
        	choice--;
        }
        Problem7 test = new Problem7();
        test.decimalNumber(Q);
        //System.out.println(Q);
	}

}
