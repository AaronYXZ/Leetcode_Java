package DepthFirstSearch;
import static DepthFirstSearch.L94_BinaryTreeInorderTraversal.TreeNode;

/*
https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.

S: Recursive
https://leetcode.com/problems/maximum-depth-of-binary-tree/discuss/34216/Simple-solution-using-Java

 */
public class L104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root){
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
