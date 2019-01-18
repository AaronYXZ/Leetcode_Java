package Tree;
/*
https://leetcode.com/problems/count-univalue-subtrees/description/

Given a binary tree, count the number of uni-value subtrees.

A Uni-value subtree means all nodes of the subtree have the same value.

Example :

Input:  root = [5,1,5,5,5,null,5]

              5
             / \
            1   5
           / \   \
          5   5   5

Output: 4

https://leetcode.com/problems/count-univalue-subtrees/discuss/67573/My-Concise-JAVA-Solution
 */

public class L250_CountUnivalSubtrees {
    public int countUnivalSubtrees(TreeNode root){
        int[] count = new int[1];
        isUnivalue(root, count);
        return count[0];
    }
    public boolean isUnivalue(TreeNode root, int[] count){
        if(root == null) return true;
        boolean left = isUnivalue(root.left, count);
        boolean right = isUnivalue(root.right, count);
        if (left && right){
            if (root.left != null && root.left.val != root.val){
                return false;
            }
            if (root.right != null && root.right.val != root.val){
                return false;
            }
            count[0]++;
            return true;
        }
        return false;
    }
}
