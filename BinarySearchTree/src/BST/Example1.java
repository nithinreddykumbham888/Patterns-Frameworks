package BST;

import java.util.Scanner;

public class Example1 {

	Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter elements to be inserted(int) ; ");
		int choice = scan.nextInt();
		System.out.println("Enter elements with space : ");
		Example1 test = new Example1();
		while(choice>0) {
			test.insert(scan.nextInt());
			choice--;
		}
		test.inorder();
	}
	
	public void insert(int value) {
		root = insertBST(root, value);
	}
	
	public Node insertBST(Node root, int value) {
		if(root == null) {
			return new Node(value);
		}
		Node curr_node = root;
		while(true) {
			if(curr_node.value >= value) {
				if(curr_node.left != null) {
					curr_node = curr_node.left;
				}
				else {
					curr_node.left = new Node(value);
					break;
				}
			}
			else {
				if(curr_node.right != null) {
					curr_node = curr_node.right;
				}
				else {
					curr_node.right = new Node(value);
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
