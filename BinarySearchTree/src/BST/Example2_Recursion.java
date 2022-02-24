package BST;

import java.util.Scanner;

public class Example2_Recursion {

	Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("BST2 using recursion");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter elements to be inserted(int) ; ");
		int choice = scan.nextInt();
		System.out.println("Enter elements with space : ");
		Example2_Recursion test = new Example2_Recursion();
		while(choice>0) {
			test.insert(scan.nextInt());
			choice--;
		}
		test.inorder();
	}
	
	public void insert(int value) {
		root = insertElements(root,value);
	}
	
	public Node insertElements(Node root,int value) {
		if(root == null) {
			return new Node(value);
		}
		if(root.value > value) {
			root.left = insertElements(root.left,value);
		}
		else {
			root.right = insertElements(root.right,value);
		}
		return root;
	}
	
	public void inorder() {
		inorderTraverse(root);
	}
	
	public void inorderTraverse(Node root) {
		if(root != null) {
			inorderTraverse(root.left);
			System.out.println(root.value);
			inorderTraverse(root.right);
		}
	}

}
