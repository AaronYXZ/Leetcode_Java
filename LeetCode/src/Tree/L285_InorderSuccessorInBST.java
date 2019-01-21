package Tree;
/*
https://leetcode.com/problems/inorder-successor-in-bst/description/
Given a binary search tree and a node in it, find the in-order successor of that node in the BST.

Note: If the given node has no in-order successor in the tree, return null.

Example 1:

Input: root = [2,1,3], p = 1

  2
 / \
1   3

Output: 2
Example 2:

Input: root = [5,3,6,2,4,null,null,1], p = 6

      5
     / \
    3   6
   / \
  2   4
 /
1

Output: null

https://leetcode.com/problems/inorder-successor-in-bst/discuss/72656/JavaPython-solution-O(h)-time-and-O(1)-space-iterative
 */

public class L285_InorderSuccessorInBST {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p){
        TreeNode res  = null;
        while (root != null){
            if (p.val < root.val){
                res = root;
                root = root.left;
            }
            else {
                root = root.right;
            }
        }
        return res;
    }
}
