package Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************Problem 01**************");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter elements of choice for first tree in int : ");
        int choice = scan.nextInt();
        System.out.println("Enter elements of choice for second tree in int : ");
        int choice1 = scan.nextInt();
        System.out.println("Enter elements of first tree with space : ");
        BST test = new BST();
        ArrayList<Integer> test2 = new ArrayList<>();
        while(choice>0) {
        	test.insert(scan.nextInt());
        	choice--;
        }
       test.inorder();
      int count = 1;
       ArrayList<Integer> output = test.output(1);
       test2.addAll(output);
       output.clear();
       //System.out.println("first tree : "+test2);
       
       count = 2;
       ArrayList<Integer> output1 = test.output(count);
       //System.out.println(output1);
       
       System.out.println("Enter elements of second tree with space : ");
       ArrayList<Integer> test21 = new ArrayList<>();
       BST test1 = new BST();
       while(choice1>0) {
       	test1.insert(scan.nextInt());
       	choice1--;
       }
      test1.inorder();
      count = count -1;
      ArrayList<Integer> output11 = test1.output(count);
      //System.out.println("second tree : "+output11);
      if(test2.equals(output11)) {
    	  System.out.println("True");
      }
      else {
    	  System.out.println("False");
      }
      
      System.out.println("\n");
      System.out.println("**************Problem 02**************");
      System.out.println("Enter elements of choice for BST in int : ");
      int choice2 = scan.nextInt();
      System.out.println("Enter a value to check : ");
      int K = scan.nextInt();
      BST test22 = new BST();
      count = 2;
      ArrayList<Integer> output12 = test22.output(count);
      System.out.println("Enter elements with space : ");
      while(choice2 > 0) {
    	  test22.insert(scan.nextInt());
    	  choice2--;
      }
      test22.inorder();
      count = count -1;
      ArrayList<Integer> output13 = test22.output(count);
      //System.out.println(output13);
      int finalsum = 0;
      for(int i=0;i<output13.size();i++) {
    	  if(output13.get(i) <= K) {
    		  finalsum = finalsum + output13.get(i);
    	  }
      }
      if(finalsum == 0) {
    	  System.out.println("-1");
      }
      else {
    	  System.out.println(finalsum);
      }
      
      System.out.println("\n");
      System.out.println("**************Problem 03**************");
      System.out.println("Enter elements of choice for BST in int : ");
      int choice3 = scan.nextInt();
      System.out.println("Enter a value to get : ");
      int K1 = scan.nextInt();
      BST test23 = new BST();
      count = 2;
      ArrayList<Integer> output14 = test23.output(count);
      if(K1 > choice3) {
    	  System.out.println("Enter value less than or equal to choice of elements : ");
    	  choice3 = scan.nextInt();
      }
      System.out.println("Enter elements with space : ");
      while(choice3>0) {
    	  test23.insert(scan.nextInt());
    	  choice3--;
      }
      test23.postorder();
      count = count -1;
      ArrayList<Integer> output15 = test23.output(count);
     System.out.println(output15.get(K1-1));
     
     System.out.println("\n");
     System.out.println("**************Problem 04**************");
     System.out.println("Enter elements of choice for BST in int : ");
     int choice4 = scan.nextInt();
     BST test24 = new BST();
     count = 2;
     ArrayList<Integer> output16 = test24.output(count);
     System.out.println("Enter elements with space : ");
     while(choice4>0) {
   	  test24.insert(scan.nextInt());
   	  choice4--;
     }
     test24.BreadthFirstSearch();
     count = count -1;
     ArrayList<Integer> output17 = test24.output(count);
     System.out.println(output17);
	}

}
