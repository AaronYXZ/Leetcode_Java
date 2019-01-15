package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;


/*
https://leetcode.com/problems/path-sum/description/
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

S1: own solution  hasPathSum + traversal
Learns from L257_BinaryTreePaths, first collect all sum from different path, store as a list of int,
then check whether sum is contained in the list

S2:
https://leetcode.com/problems/path-sum/discuss/36378/AcceptedMy-recursive-solution-in-Java


 */

public class L112_PathSum {
    public boolean hasPathSum(TreeNode root, int sum){
        List<Integer> sumOfTree = new ArrayList<>();
        if ( root != null) traversal(root, 0, sumOfTree);
        return sumOfTree.contains(sum);
    }

    public void traversal(TreeNode root, int sumSoFar, List<Integer> sumOfTree){
        if (root.left == null && root.right == null) sumOfTree.add(sumSoFar + root.val);
        if (root.left != null) traversal(root.left, sumSoFar + root.val, sumOfTree);
        if (root.right != null) traversal(root.right, sumSoFar + root.val, sumOfTree);
    }

    public boolean hasPathSumBetterSolution(TreeNode root, int sum){
        if (root == null) return false;
        if (root.left == null && root.right == null) return sum == root.val;
        return (hasPathSumBetterSolution(root.left, sum - root.val) || hasPathSumBetterSolution(root.right, sum-root.val));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        L112_PathSum l112_pathSum = new L112_PathSum();
        System.out.println(l112_pathSum.hasPathSum(root, 22));
    }
}
