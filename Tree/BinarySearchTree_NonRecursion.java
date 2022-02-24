package Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BinarySearchTree_NonRecursion {

	Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Binary Search Tree using Non-Recursion");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter elements count in int : ");
//		int choice = scan.nextInt();
//		System.out.println("Enter elements with space : ");
		BinarySearchTree_NonRecursion test = new BinarySearchTree_NonRecursion();
//		while(choice>0) {
//			test.insert(scan.nextInt());
//			choice--;
//		}

		test.insert(10);
		test.insert(5);
		test.insert(18);
		test.insert(2);
		test.insert(6);
		test.insert(15);
		test.insert(20);
		System.out.println("Inorder traversal");
		test.inorder();
		System.out.println("\n");
		System.out.println("preorder traversal");
		test.preorder();
		System.out.println("\n");
		System.out.println("postorder traversal");
		test.postorder();
		System.out.println("\n");
		System.out.println("BreadthFirst traversal");
		test.BFS();
	}
	
	public void inorder() {
		inorderTraversal(root);
	}
	
	public void preorder() {
		preorderTraversal(root);	
	}
	
	public void postorder() {
		postorderTraversal(root);	
	}
	
	public void BFS() {
		BreadthFirstSearchTraversal(root);
	}
	
	public void inorderTraversal(Node root) {
		if(root != null) {
			inorderTraversal(root.left);
			System.out.print(root.value+" ");
			inorderTraversal(root.right);
		}
	}
	
	public void preorderTraversal(Node root) {
		if(root != null) {
			System.out.print(root.value+" ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	
	public void postorderTraversal(Node root) {
		if(root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.value+" ");
		}
	}
	
	public void BreadthFirstSearchTraversal(Node root) {
		//System.out.print(root+" ");
		Deque<Node> test1 = new ArrayDeque<>();
		if(root != null) {
			test1.add(root);
		}
		while(!test1.isEmpty()) {
			Node temp = test1.remove();
			System.out.print(temp.value+" ");
			if(temp.left != null) {
				test1.add(temp.left);
			}
			if(temp.right != null) {
				test1.add(temp.right);
			}
		}
	}
	
	public void insert(int value) {
		root = insertElements(root,value);
	}
	
	public Node insertElements(Node root,int value) {
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

}
