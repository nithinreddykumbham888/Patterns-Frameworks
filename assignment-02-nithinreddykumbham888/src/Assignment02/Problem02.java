package Assignment02;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem02 {

	public static Map<String, String> concatString(String[] S1){
		int size = S1.length;
		ArrayList<Character> A1 = new ArrayList<>();
		Map<String, String> A2 = new LinkedHashMap<>();
		for(int i=0;i<size;i++) {
			char[] array = S1[i].toCharArray();
			for(int j=0;j<1;j++) {
				//System.out.println(array[j]+"\n");
				if(!A2.containsKey(array[j]+"")) {
					//System.out.println("enter");
					A1.add(array[j]);
					String string = A1.stream()
		                     .map(String::valueOf)
		                     .collect(Collectors.joining());
					A1.clear();
					A2.put(string, S1[i]);
				}
				else {
					A1.add(array[j]);
					String string = A1.stream()
		                     .map(String::valueOf)
		                     .collect(Collectors.joining());
					A1.clear();
					   A2.put(string, A2.get(string)+S1[i]);
				}	
			}
		}
		return A2;
	}
}
