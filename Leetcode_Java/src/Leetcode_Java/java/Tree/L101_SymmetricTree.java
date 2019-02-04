package Tree;
/*

https://leetcode.com/problems/symmetric-tree/description/

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.

S:
https://leetcode.com/problems/symmetric-tree/discuss/33054/Recursive-and-non-recursive-solutions-in-Java

 */


public class L101_SymmetricTree {

    public boolean isSymmetric(TreeNode root){
//        if (root == null) return true;
//        if (helper(root.left, root.right)) return true;
//        return false;
        return (helper(root.left, root.right)) || (root == null);
    }

    public boolean helper(TreeNode left, TreeNode right){
//        if (left == null && right == null) return true;
//        if (left == null && right != null) return false;
//        if (left != null && right == null) return false;
        if (left == null || right == null){
            return left == right;
        }
        if (left.val != right.val) return false;

        return helper(left.right, right.left) && helper(left.left, right.right);
    }
}
