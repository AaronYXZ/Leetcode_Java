package Tree;


/*
https://leetcode.com/problems/balanced-binary-tree/discuss/35686/Java-solution-based-on-height-check-left-and-right-node-in-every-recursion-to-avoid-further-useless-search

Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example 1:

Given the following tree [3,9,20,null,null,15,7]:

    3
   / \
  9  20
    /  \
   15   7
Return true.

Example 2:

Given the following tree [1,2,2,3,3,null,null,4,4]:

       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
Return false.

S:
https://leetcode.com/problems/balanced-binary-tree/discuss/35686/Java-solution-based-on-height-check-left-and-right-node-in-every-recursion-to-avoid-further-useless-search
 */
public class L110_BalancedTree {
    public boolean Solution(TreeNode root){
        if (root == null) return true;
        return Height(root) != -1;
    }

    public static int Height(TreeNode node){
        if (node == null) return 0;

        int lH = Height(node.left);
        if (lH == -1) return -1;

        int rH = Height(node.right);
        if (rH == -1) return -1;

        if (lH - rH < -1 || lH - rH> 1) return -1;

        return Math.max(lH,  rH) + 1;
    }
}
