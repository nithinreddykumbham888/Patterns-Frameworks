package BST;

import java.util.Scanner;

public class Example1_Recursion {

	Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("BST using recursion");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter elements to be inserted(int) ; ");
		int choice = scan.nextInt();
		System.out.println("Enter elements with space : ");
		Example1_Recursion test = new Example1_Recursion();
		while(choice>0) {
			test.insert(scan.nextInt());
			choice--;
		}
		test.inorder();
	}
	
	public void insert(int value) {
		root = insertBST_Recursion(root, value);
	}
	
	public Node insertBST_Recursion(Node root, int value) {
		if(root == null) {
			return new Node(value);
		}
		if(root.value > value) {
			root.left = insertBST_Recursion(root.left, value);
		}
		else {
			root.right = insertBST_Recursion(root.right, value);
		}
		return root;
	}
	
	public void inorder() {
		inordertraverse(root);
	}
	
	public void inordertraverse(Node root) {
		if(root != null) {
			inordertraverse(root.left);
			System.out.println(root.value);
			inordertraverse(root.right);
		}
	}
}
