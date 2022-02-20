package Assignment02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem01 {

	public static Map<String,Integer> occurance(ArrayList<String> arr){
		//System.out.println(array.size());
		Map<String,Integer> map1 = new LinkedHashMap<String,Integer>();
		
		for(int i=0;i<arr.size();i++) {
			if(map1.containsKey(arr.get(i))) {
				map1.put(arr.get(i), map1.get(arr.get(i))+1);
			}else {
				map1.put(arr.get(i),1);
			}
			
		}
		return map1;
	}
}
