public class Tree_in_order {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	static void preorder(Node root) {
		if(root==null) {
			return;
		}
		preorder(root.left);
		System.out.println(root.data+" ");
		preorder(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		preorder(root);
	}

}