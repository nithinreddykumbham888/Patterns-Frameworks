package testHeap;

import java.util.ArrayList;
import java.util.Collections;

public class HeapPractice {
	
	public static Integer smallestMinHeap(MinHeap H)
	{
		ArrayList<Integer> output = H.display();
		output.remove(0);
		int output1 = Collections.min(output);
		return output1;
	}
	
	public static Integer largestMaxHeap(MaxHeap H)
	{
		ArrayList<Integer> output = H.display();
		output.remove(0);
		int output1 = Collections.max(output);
		return output1;
	}
	
	public static Integer largestMinHeap(MinHeap H)
	{
		ArrayList<Integer> output = H.display();
		output.remove(0);
		int output1 = Collections.max(output);
		return output1;
	}
	
	public static Integer smallestMaxHeap(MaxHeap H)
	{
		ArrayList<Integer> output = H.display();
		output.remove(0);
		int output1 = Collections.min(output);
		return output1;
	}
	
	public static void main(String[] args)
	{
		// Create Min Heap for 2, 5, 18, 10, 6, 22
		MinHeap H1 = new MinHeap();
		H1.insert(2);H1.insert(5);H1.insert(18);H1.insert(10);H1.insert(6);H1.insert(22);
		System.out.println("Smallest of MinHeap: " + HeapPractice.smallestMinHeap(H1));
		System.out.println("Largest of MinHeap: " + HeapPractice.largestMinHeap(H1));
		
		// Create Max Heap for 10, 9, 8, 7, 6, 5, 4
		MaxHeap H2 = new MaxHeap();
		H2.insert(10);H2.insert(9);H2.insert(8);H2.insert(7);H2.insert(6);H2.insert(5);H2.insert(4);
		System.out.println("Largest of MaxHeap: " + HeapPractice.largestMaxHeap(H2));
	    System.out.println("Smallest of MaxHeap: " + HeapPractice.smallestMaxHeap(H2));
		
	}

}
