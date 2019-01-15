package DepthFirstSearch;
// https://www.geeksforgeeks.org/?p=618/
public class DFS_BFS_Demo {
    public static void printPostOrder(TreeNode root){
        if (root == null) return;
        printPostOrder(root.left);

        printPostOrder(root.right);

        System.out.println(root.val);
    }

    public static void printPreOrder(TreeNode root){
        if (root == null) return;

        System.out.println(root.val);

        printPreOrder(root.left);

        printPreOrder(root.right);
    }

    public static void printInOrder(TreeNode root){
        if (root == null) return;

        printInOrder(root.left);

        System.out.println(root.val);

        printInOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        System.out.println("Pre Order Traversal");
        printPreOrder(root);

        System.out.println("In Order Traversal");
        printInOrder(root);

        System.out.println("Post Order Traversal");
        printPostOrder(root);
    }

}
