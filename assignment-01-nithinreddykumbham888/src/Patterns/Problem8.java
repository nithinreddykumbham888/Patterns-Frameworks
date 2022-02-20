package Patterns;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Problem8 {
	
	public void sortSequence(Deque<Integer> Q) {
		ArrayList<Integer> A1 = new ArrayList<>();
		int sizeS = Q.size();
        for(int i=0;i<sizeS/2;i++) {
        	A1.add(Q.pollLast());
        	A1.add(Q.pollFirst());
        }
        
        if(sizeS % 2 !=0) {
        	A1.add(Q.poll());
        }
        System.out.println(A1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        Deque<Integer> Q = new ArrayDeque<>();
        
        System.out.println("Enter number of elements : ");
        int choice = scan.nextInt();
        System.out.println("Enter elements with space : ");
        while(choice>0) {
        	Q.add(scan.nextInt());
        	choice--;
        }
        Problem8 test = new Problem8();
        test.sortSequence(Q);
        
	}

}
