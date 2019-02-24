package Tree_Traversal;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Q:
https://leetcode.com/problems/validate-binary-search-tree/description/

Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
Example 1:

Input:
    2
   / \
  1   3
Output: true
Example 2:

    5
   / \
  1   4
     / \
    3   6
Output: false
Explanation: The input is: [5,1,4,null,null,3,6]. The root node's value
             is 5 but its right child's value is 4.

https://leetcode.com/problems/validate-binary-search-tree/discuss/32112/Learn-one-iterative-inorder-traversal-apply-it-to-multiple-tree-questions-(Java-Solution)

 */

public class L98_ValideBinarySearchTree {
    // In-order traversal, keep record of the pre node. Compare pre.val and curr.val
    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode pre = null;
        TreeNode curr = root;
        while(curr != null || !deque.isEmpty()){
            if (curr != null){
                deque.offerLast(curr);
                curr = curr.left;
            }
            else{
                curr = deque.pollLast();
                if (pre != null && pre.val >= curr.val) return false;
                pre = curr;
                curr = curr.right;
            }
        }
        return true;
    }

    public static boolean validBST(TreeNode root){
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode pre = null;
        while (root != null || !deque.isEmpty()){
            while (root != null){
                deque.push(root);
                root = root.left;
            }
            root = deque.pop();
            if (pre != null && pre.val >= root.val) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }

}
