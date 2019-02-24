package Tree_Traversal;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/*
https://leetcode.com/problems/most-frequent-subtree-sum/description/
Given the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.

Examples 1
Input:

  5
 /  \
2   -3
return [2, -3, 4], since all the values happen only once, return all of them in any order.
Examples 2
Input:

  5
 /  \
2   -5
return [2], since 2 happens twice, however -5 only occur once.
Note: You may assume the sum of values in any subtree is in the range of 32-bit signed integer.

https://leetcode.com/problems/most-frequent-subtree-sum/discuss/98664/Verbose-Java-solution-postOrder-traverse-HashMap-(18ms)
 */

public class L508_MostFrequentSubtreeSum {
    Map<Integer, Integer> sumCount;
    int maxCount;

    public int[] findFrequentTreeSum(TreeNode root){
        List<Integer> list = new LinkedList<>();

        maxCount = 0;
        sumCount = new HashMap<Integer, Integer>();

        postOrderHelper(root);
        // get map of sum to count through postOrderHelper

        for (Map.Entry<Integer, Integer> entry:sumCount.entrySet()){
            if (entry.getValue() == maxCount){
                list.add(entry.getKey());
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

    private int postOrderHelper(TreeNode root){
        // use a helper func to recursively do post-order traversal and collect subtree sum
        if (root == null) return 0;
        int left = postOrderHelper(root.left);
        int right = postOrderHelper(root.right);
        int sum = root.val + left + right;
        int count = sumCount.getOrDefault(sum, 0) + 1;
        sumCount.put(sum, count);
        maxCount = Math.max(maxCount, count);
        return sum;
    }
}
