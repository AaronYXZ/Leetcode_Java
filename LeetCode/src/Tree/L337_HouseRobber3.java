package Tree;

/*
https://leetcode.com/problems/house-robber-iii/description/
The thief has found himself a new place for his thievery again. There is only one entrance to this area, called the "root." Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that "all houses in this place forms a binary tree". It will automatically contact the police if two directly-linked houses were broken into on the same night.

Determine the maximum amount of money the thief can rob tonight without alerting the police.

Example 1:

Input: [3,2,3,null,3,null,1]

     3
    / \
   2   3
    \   \
     3   1

Output: 7
Explanation: Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
Example 2:

Input: [3,4,5,1,3,null,1]

     3
    / \
   4   5
  / \   \
 1   3   1

Output: 9
Explanation: Maximum amount of money the thief can rob = 4 + 5 = 9.

https://leetcode.com/problems/house-robber-iii/discuss/79330/Step-by-step-tackling-of-the-problem
Stpe 3
 */
public class L337_HouseRobber3 {
    public int rob(TreeNode root){
        int[] robs = robNode(root);
        return Math.max(robs[0], robs[1]);
    }

    public int[] robNode(TreeNode root){
        if (root == null) return new int[]{0, 0};
        int[] robs = new int[2];
        int[] left = robNode(root.left);
        int[] right = robNode(root.right);
        robs[1] = left[0] + right[0] + root.val;
        robs[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return robs;
    }
}
