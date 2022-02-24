package BST;

import java.util.Scanner;

public class BinarySearchTreeInsertion {
	
	Node root;
	
	public BinarySearchTreeInsertion() {
		root = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements to be entered(int) : ");
		int choice = scan.nextInt();
		System.out.println("Enter element to be inserted : ");
		BinarySearchTreeInsertion S1 = new BinarySearchTreeInsertion();
        while(choice>0) {
			S1.insert(scan.nextInt());
			choice--;
		}
        S1.desc();
	}
	
	public void insert(int value) {
		root = insertNewValue(root,value);
		//System.out.println(root);
	}
	  
	public Node insertNewValue(Node root,int value) {
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
	
	public void desc() {
		descending(root);
	}
	
	public void descending(Node root) {
		if(root != null) {
			descending(root.right);
			System.out.println(root.value);
			descending(root.left);
		}
	}

}
