package Assignment02;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem05 {

	public static Map<String, String> firstLast(ArrayList<String> A){
		int length = A.size();
		Map<String,String> A1 = new LinkedHashMap<>();
		ArrayList<Character> A2 = new ArrayList<>();
		for(int i=0;i<length;i++) {
			char[] array = A.get(i).toCharArray();
			for(int j=0;i<array.length;j--) {
				A2.add(array[j]);
				String string = A2.stream()
	                     .map(String::valueOf)
	                     .collect(Collectors.joining());
				A2.clear();
				A2.add(array[array.length-1]);
				String string1 = A2.stream()
	                     .map(String::valueOf)
	                     .collect(Collectors.joining());
				A1.put(string, string1);
				break;
			}
			A2.clear();
//			System.out.println(array);
		}
		return A1;
	}
}
