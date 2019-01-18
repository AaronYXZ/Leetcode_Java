package Tree;
/*
https://leetcode.com/problems/longest-univalue-path/description/
Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.

Note: The length of path between two nodes is represented by the number of edges between them.

Example 1:

Input:

              5
             / \
            4   5
           / \   \
          1   1   5
Output:

2
Example 2:

Input:

              1
             / \
            4   5
           / \   \
          4   4   5
Output:

2
Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.

https://leetcode.com/problems/longest-univalue-path/discuss/108136/JavaC++-Clean-Code
 */

public class L687_LongestUnivaluePath {

    public int longestUinvaluePath(TreeNode root) {
        int[] max = new int[1];
        dfs(root, max);
        return max[0];
    }

    public int dfs(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }
        int l = (root.left == null) ? 0 : dfs(root.left, max);
        // Longest-Univalue-Path-Start-At - left child
        int r = (root.right == null) ? 0 : dfs(root.right, max);
        // Longest-Univalue-Path-Start-At - right child
        int resL = (root.left != null && root.left.val == root.val) ? l + 1 : 0;
        // Longest-Univalue-Path-Start-At - node, and go left
        int resR = (root.right != null && root.right.val == root.val) ? r + 1 : 0;
        // Longest-Univalue-Path-Start-At - node, and go right
        max[0] = Math.max(max[0], resL + resR);
        // Longest-Univalue-Path-Across - node
        return Math.max(resL, resR);
    }
}
