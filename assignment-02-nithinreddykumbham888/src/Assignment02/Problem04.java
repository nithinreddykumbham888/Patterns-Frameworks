package Assignment02;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem04 {

	public static ArrayList<String> removeDuplicates(ArrayList<String> A1){
		int length = A1.size();
		char[] array;
		//System.out.println(length);
		ArrayList<Character> A2 = new ArrayList<>();
		ArrayList<String> A3 = new ArrayList<>();
		//Set<Character> A3 = new LinkedHashSet<>();
		for(int i=0;i<length;i++) {
			array = A1.get(i).toCharArray();
			//System.out.println(array);
			for(int j=0;j<array.length;j++) {
				if(!A2.contains(array[j])) {
					A2.add(array[j]);
				}
				//System.out.println(array[j]);
			}
			 String string = A2.stream()
                     .map(String::valueOf)
                     .collect(Collectors.joining());
			A3.add(string);
			A2.clear();
			//System.out.println(A3);
		}
		return A3;
	}
}
