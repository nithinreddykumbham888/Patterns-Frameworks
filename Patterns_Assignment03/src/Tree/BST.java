package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class BST {

	Node root;
	ArrayList<Integer> test1 = new ArrayList<>();
	public void inorder() {
	 inorderRec(root);
	}
	
	public void postorder() {
		postorderRec(root);
	}
	
	public void BreadthFirstSearch() {
		BreadthFirstSearchTraversal(root,true);
	}
	
	public void inorderRec(Node root) {
		if(root != null) {
			inorderRec(root.left);
			test1.add(root.value);
			//System.out.print(root.value+" ");
			inorderRec(root.right);
		}
	}
	
	public void postorderRec(Node root) {
		if(root!=null) {
			postorderRec(root.right);
			test1.add(root.value);
			postorderRec(root.left);
		}
	}
	
	public void BreadthFirstSearchTraversal(Node root,boolean isOdd) {
		//System.out.print(root+" ");
//		Deque<Node> test11 = new ArrayDeque<>();
//		if(root != null) {
//			test11.add(root);
//		}
//		while(!test11.isEmpty()) {
//			Node temp = test11.remove();
//			test1.add(temp.value);
//			//System.out.print(temp.value+" ");
//			if(temp.left != null) {
//				test11.add(temp.left);
//			}
//			if(temp.right != null) {
//				test11.add(temp.right);
//			}
//		}
		if (root == null)
		    return;
		 
		    // If current node is of odd level
		    if (isOdd == true)
		    test1.add(root.value);
		   // System.out.print(root.value + " ");
		 
		    // Recur for children with isOdd
		    // switched.
		    BreadthFirstSearchTraversal(root.left, !isOdd);
		    BreadthFirstSearchTraversal(root.right, !isOdd);
	}
	
	
	public ArrayList<Integer> output(int value){
		//System.out.println(test1);
		if(value == 1) {
			//System.out.println("Eleemts of array list "+test1);
		return test1;
		}
		if(value == 2) {
			test1.clear();
			return test1;
		}
		
		return null;
	}
	
	public void insert(int value) {
		root = insertElements(root,value);
	}
	
	public Node insertElements(Node root, int value) {
		if(root == null) {
			return new Node(value);
		}
		if(root.value > value) {
			root.left = insertElements(root.left, value);
		}
		else {
			root.right = insertElements(root.right, value);
		}
		return root;
	}
	
}
