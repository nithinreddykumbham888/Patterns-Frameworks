package testRegularExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssignmentSix {
	
	public static void Problem01() {
		
		System.out.println("***************Problem01***************");
		// Regular Expression for problem01
		 String regex01 = "^[A-Z]{1}[a-z]{7}$";
	        String testStr01 = "Nithinre";
	        Pattern p1 = Pattern.compile(regex01);
	        Matcher m1 = p1.matcher(testStr01);
	        boolean r1 = m1.find();
	        if(r1 == true)
	           System.out.println("Matching pattern : "+r1);
	        else
	        	System.out.println("Matching pattern : "+r1);
	        
	        String testStr02 = "Nithinred";
	        Pattern p2 = Pattern.compile(regex01);
	        Matcher m2 = p2.matcher(testStr02);
	        boolean r2 = m2.find();
	        if(r2 == true)
	           System.out.println("Non-Matching pattern : "+r2);
	        else
	        	System.out.println("Non-Matching pattern : "+r2);
	        
	}
	        public static void Problem02(){
	        	
	        System.out.println("\n***************Problem02***************");
	        // Regular Expression for problem02    
	         String regex03 = "[\\w{1,}]*[\\s{0,}]*[.;]$";
	         String testStr03 = "K    UMbham   @Nithin01$   Reddy&08 .";
	         Pattern p3 = Pattern.compile(regex03);
	         Matcher m3 = p3.matcher(testStr03);
	         boolean r3 = m3.find();
	         if(r3 == true)
	        	 System.out.println("Matching pattern : "+r3);
		        else
		        	System.out.println("Matching pattern : "+r3);
	
	            String testStr04 = "#    HelloNithin ";
		        Pattern p4 = Pattern.compile(regex03);
		        Matcher m4 = p4.matcher(testStr04);
		        boolean r4 = m4.find();
		        if(r4 == true)
		           System.out.println("Non-Matching pattern : "+r4);
		        else
		        	System.out.println("Non-Matching pattern : "+r4);
	}
	        public static void Problem03(){
	        	
		        System.out.println("\n***************Problem03***************");
		        // Regular Expression for problem03 Beginning of the sentence should start with one of the articles (The, 
		        //A, An)
		        //ii. Sentence should end with one of the terminators (full stop(.), 
		        //semicolon(;))    
		         String regex05 = "[The|A|An]\\b[\\W{0,}\\w{1,}\\s{0,}]*[.;]$";;
		         String testStr05 = "A $ b75378587235875785          qsdjkgskjg.";
		         Pattern p5 = Pattern.compile(regex05);
		         Matcher m5 = p5.matcher(testStr05);
		         boolean r5 = m5.find();
		         if(r5 == true)
		        	 System.out.println("Matching pattern : "+r5);
			        else
			        	System.out.println("Matching pattern : "+r5);
		
		            String testStr06 = "Hello Mr.Nithin Reddy . ";
			        Pattern p6 = Pattern.compile(regex05);
			        Matcher m6 = p6.matcher(testStr06);
			        boolean r6 = m6.find();
			        if(r6 == true)
			           System.out.println("Non-Matching pattern : "+r6);
			        else
			        	System.out.println("Non-Matching pattern : "+r6);
		}
	        
          public static void Problem04(){
	        	
		        System.out.println("\n***************Problem04***************");
		        // Regular Expression for problem04 a. Define a regular expression that captures a word ‘java’ in a sentence
		        //b. Define a string for matching the above pattern and test 
		        //c. Write a program to count the number of  word ‘java’ in the string    
		         String regex07 = "\\bjava";
		         String testStr07 = "A $ b75378587235875785   java       java qsdjkgskjg.";
		         Pattern p7 = Pattern.compile(regex07);
		         Matcher m7 = p7.matcher(testStr07);
		         boolean r7 = m7.find();
		         if(r7 == true)
		        	 System.out.println("Matching pattern : "+r7);
			        else
			        	System.out.println("Matching pattern : "+r7);
		       
		         ArrayList<String> testStr08 = new ArrayList<>(Arrays.asList(testStr07.split("\\s+")));
		         int count = 0;
		         for(int i=0;i<testStr08.size();i++) {
		        	 if(testStr08.get(i).contains("java")) {
		        		 count++;
		        	 }
		         }
		         System.out.println("Total number of java words in string is : "+count);
		         
		        
		         
		         
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentSix testRE = new AssignmentSix();
		testRE.Problem01();
		testRE.Problem02();
		testRE.Problem03();
        testRE.Problem04();
	}

}
