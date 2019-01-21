package Tree;

import java.util.HashMap;
/*
https://leetcode.com/problems/equal-tree-partition/description/
Given a binary tree with n nodes, your task is to check if it's possible to partition the tree to two trees which have the equal sum of values after removing exactly one edge on the original tree.

Example 1:
Input:
    5
   / \
  10 10
    /  \
   2   3

Output: True
Explanation:
    5
   /
  10

Sum: 15

   10
  /  \
 2    3

Sum: 15
Example 2:
Input:
    1
   / \
  2  10
    /  \
   2   20

Output: False
Explanation: You can't split the tree into two trees with equal sum after removing exactly one edge on the tree.
Note:
The range of tree node value is in the range of [-100000, 100000].
1 <= n <= 10000
https://leetcode.com/problems/equal-tree-partition/discuss/106727/JavaC++-Simple-solution-with-only-one-HashMaplessgreater.

The idea is to get the sum of total tree. Get the sum of each subtree also. Store them in a map. Check if there's
any sum that equals to half of the total tree.
Be careful to the case where sum of total tree equals 0. Need to check if there are at least 2 appearances of this number
 */

public class L663_EqualTreePartition {
    public boolean checkEqualTree(TreeNode root){
       if (root == null) return false;
       HashMap<Integer, Integer> map = new HashMap<>();
       int sum = sumOfTree(root, map);
       if (sum == 0) return map.getOrDefault(sum, 0) > 1;
       return sum % 2== 0 && map.containsKey(sum /2) ;
    }

    public int sumOfTree(TreeNode root, HashMap<Integer, Integer> map){
        if (root == null) return 0;

        int result =  sumOfTree(root.left, map) + sumOfTree(root.right, map) + root.val;
        map.put(result, map.getOrDefault(result, 0) + 1);
        return result;
    }



}
