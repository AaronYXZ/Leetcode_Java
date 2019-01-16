package Tree;

import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/

Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

Example 1:
Input:
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9

Output: True
Example 2:
Input:
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28

Output: False

https://leetcode.com/problems/two-sum-iv-input-is-a-bst/discuss/106059/JavaC++-Three-simple-methods-choose-one-you-like
 */

public class L653_TwoSum4_InputIsBST {
    public boolean findTarget(TreeNode root, int k){
        if (root == null) return false;
        Set<Integer> set = new HashSet<>();
        return traversal(root, k, set);
    }

    public boolean traversal(TreeNode root, int k, Set<Integer> set){
        if (root == null) return false;
        if (set.contains(root.val)) return true;
        set.add(k - root.val);
        return (traversal(root.left, k, set)) || (traversal(root.right, k, set));
    }

}
