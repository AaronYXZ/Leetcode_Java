package Tree;
/*
https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/description/
Given a binary tree, find the length of the longest consecutive sequence path.

The path refers to any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The longest consecutive path need to be from parent to child (cannot be the reverse).

Example 1:

Input:

   1
    \
     3
    / \
   2   4
        \
         5

Output: 3

Explanation: Longest consecutive sequence path is 3-4-5, so return 3.
Example 2:

Input:

   2
    \
     3
    /
   2
  /
 1

Output: 2

Explanation: Longest consecutive sequence path is 2-3, not 3-2-1, so return 2.
https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/discuss/74468/Easy-Java-DFS-is-there-better-time-complexity-solution
 */

public class L298_BinaryTreeLongestConsecutiveSequence {
    private int max = 0;
    public int longestConsecutive(TreeNode root){
        if (root == null) return 0;
        helper(root, 0, root.val);
        return max;
    }
    private void helper(TreeNode root, int curr, int target){
        if (root == null) return;
        if (root.val == target) curr++;
        else curr = 1;
        max = Math.max(max, curr);
        helper(root.left, curr, root.val + 1);
        helper(root.right, curr, root.val + 1);

    }
}
