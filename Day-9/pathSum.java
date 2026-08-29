public class pathSum {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
        }
    }
    static boolean hasPathSum(Node root, int target){
        if(root==null)
            return false;
        target = target-root.data;
        if (root.left==null && root.right==null)
            return target==0;
        return hasPathSum(root.left, target)||hasPathSum(root.right, target);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(4);
        root.right.right=new Node(4);
        int target =8;
        if (hasPathSum(root, target))
            System.out.println("path with sum : "+ target + " exists");
        else
            System.out.println("Path doesnt exist !");


    }
    
}
