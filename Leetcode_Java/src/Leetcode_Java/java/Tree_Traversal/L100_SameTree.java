package Tree_Traversal;

/*
Q:
https://leetcode.com/problems/same-tree/description/

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false

S:
https://leetcode.com/problems/same-tree/discuss/32687/Five-line-Java-solution-with-recursion
 */
public class L100_SameTree {
    public boolean SameTree(L94_BinaryTreeInorderTraversal.TreeNode p, L94_BinaryTreeInorderTraversal.TreeNode q){
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val == q.val) return SameTree(p.left, q.left) && SameTree(p.right, q.right);
        return false;
    }
}
