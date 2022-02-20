package Assignment02;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem03 {

	public static Set<Integer> sequential(int[] A1){
		int size = A1.length;
		Set<Integer> A2 = new LinkedHashSet<>();
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(A1[i] == A1[j]) {
					for(int k=j;k<size;k++) {
						A1[k] = A1[k]+1;
					}
				}
			}
			A2.add(A1[i]);
		}
//		A2.addAll(A1);
		return A2;
		
	}
}
