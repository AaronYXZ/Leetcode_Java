package DepthFirstSearch;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
https://leetcode.com/problems/binary-tree-preorder-traversal/description/

https://leetcode.com/problems/binary-tree-preorder-traversal/discuss/45266/Accepted-iterative-solution-in-Java-using-stack.
 */
public class L144_BinaryTreePreorderTraversal {

    public static List<Integer> preorderTraversal(TreeNode node) {
        List<Integer> list = new LinkedList<Integer>();
        Stack<TreeNode> rights = new Stack<TreeNode>();
        while(node != null) {
            list.add(node.val);
            if (node.right != null) {
                rights.push(node.right);
            }
            node = node.left;

            // if node's null, meaning there's no left node, we turn to right node
            if (node == null && !rights.isEmpty()) {
                node = rights.pop();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        List<Integer> result = preorderTraversal(root);
        result.stream().forEach(System.out::println);
    }
}
