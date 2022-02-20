package Patterns;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {

	public void arrangeInAsc(ArrayList<String> A1) {
		ArrayList<String> A2 = new ArrayList<>();
		String[] a1 = new String[A1.size()];
		A1.toArray(a1);
		int[] a2 = new int[A1.size()];
		int i = 0;
		for (String s : A1) {
			a2[i++] = s.length();
		}
		for (int k = 0; k < A1.size() - 1; k++) {
			for (int y = 0; y < A1.size() - k - 1; y++) {
				if (a2[y] > a2[y + 1]) {
//					swap(a1,y,y+1);
					int temp = a2[y];
					a2[y] = a2[y + 1];
					a2[y+1] = temp;
					String t2 = a1[y];
					a1[y] = a1[y + 1];
					a1[y+1] = t2;
//					swap(a2,y,y+1);

				}
			}
		}
		
	
		for (String t : a1) {
			System.out.print(t + "  ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		ArrayList<String> A1 = new ArrayList<>();
		System.out.println("Enter number of elements : ");
		int choice = scan.nextInt();
		System.out.println("Enter elements with space : ");
		while (choice > 0) {
			A1.add(scan.next());
			choice--;
		}
		Problem4 test = new Problem4();
		test.arrangeInAsc(A1);
		// System.out.println(objList);
		// System.out.println(sizeS);

	}

}
