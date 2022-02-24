package BST;

import java.util.Scanner;

public class Example2_NonRecursion {

	Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("BST2 using non recursion");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter elements to be inserted(int) ; ");
			int choice = scan.nextInt();
			System.out.println("Enter elements with space : ");
			Example2_NonRecursion test = new Example2_NonRecursion();
			while(choice>0) {
				test.insert(scan.nextInt());
				choice--;
			}
			test.inorder();
	}
	
	public void insert(int value) {
		root = insertElements(root, value);
	}

	public Node insertElements(Node root, int value) {
		if(root == null) {
			return new Node(value);
		}
		Node current_node = root;
		while(true) {
			if(current_node.value >= value) {
				if(current_node.left != null) {
					current_node = current_node.left;
				}
				else {
					current_node.left = new Node(value);
					break;
				}
			}
			else {
				if(current_node.right != null) {
					current_node = current_node.right;
				}
				else {
					current_node.right = new Node(value);
					break;
				}
			}
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
