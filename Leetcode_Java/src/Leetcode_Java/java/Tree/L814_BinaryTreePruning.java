package Tree;
/*
https://leetcode.com/problems/binary-tree-pruning/description/

https://leetcode.com/problems/binary-tree-pruning/discuss/122730/C++JavaPython-Self-Explaining-Solution-and-2-lines
 */

public class L814_BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root){
//        if (curr.val == 0 && curr.left == null && curr.right == null){

        if (root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.val == 0) return null;
        return root;
    }
}
