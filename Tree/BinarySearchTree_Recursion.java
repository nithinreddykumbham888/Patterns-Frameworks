package Tree;

public class BinarySearchTree_Recursion {

	Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Binary Search Tree using Recursion");
		BinarySearchTree_Recursion test = new BinarySearchTree_Recursion();
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

}
