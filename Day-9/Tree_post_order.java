
public class Tree_post_order {
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
		preorder(root.right);
		System.out.println(root.data+" ");
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