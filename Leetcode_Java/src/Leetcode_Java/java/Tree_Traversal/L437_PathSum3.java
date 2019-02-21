package Tree_Traversal;

/*
https://leetcode.com/problems/path-sum-iii/description/
You are given a binary tree in which each node contains an integer value.

Find the number of paths that sum to a given value.

The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

Example:

root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

      10
     /  \
    5   -3
   / \    \
  3   2   11
 / \   \
3  -2   1

Return 3. The paths that sum to 8 are:

1.  5 -> 3
2.  5 -> 2 -> 1
3. -3 -> 11


https://leetcode.com/problems/path-sum-iii/discuss/91889/Simple-Java-DFS
 */

public class L437_PathSum3 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        // # of paths in a tree, can be calculated as # of paths starting from the root, and # of paths of two
        // sub trees: rooted in root.left and root.right
        // which gives the function below: pathSum = sumFrom(root) + Sum(root.left) + Sum(root.right)
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int pathSumFrom(TreeNode node, int sum) {
        // calculates the # of paths starting from the given node.
        // it can be split into 3 parts: 1) if the current node itself is a path,
        // 2) # of paths starting from node.left, with sums equal to sum - node.val
        // 3) # of paths staritng from node.right, with sums equal to sum - node.val
        if (node == null) return 0;
        return (node.val == sum ? 1 : 0)
                + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
    }
}
