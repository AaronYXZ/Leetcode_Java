package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;
/*
https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/

You need to find the largest value in each row of a binary tree.

Example:
Input:

          1
         / \
        3   2
       / \   \
      5   3   9

Output: [1, 3, 9]


https://leetcode.com/problems/find-largest-value-in-each-tree-row/discuss/98971/9ms-JAVA-DFS-solution
 */

public class L515_FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        addValue(root, 0, result);
        return result;
    }
    public void addValue(TreeNode root, int depth, List<Integer> result){
        if (root == null) return;
        if (result.size() == depth){
            result.add(root.val);
        }
        else{
            result.set(depth, Math.max(result.get(depth), root.val));
        }
        addValue(root.left, depth + 1, result);
        addValue(root.right, depth+1, result);

    }
}
