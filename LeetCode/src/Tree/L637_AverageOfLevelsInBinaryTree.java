package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
Example 1:
Input:
    3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
Note:
The range of node's value is in the range of 32-bit signed integer.


https://leetcode.com/problems/average-of-levels-in-binary-tree/discuss/105107/Java-BFS-Solution
Use Level Order Traversals.
 */

public class L637_AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> results = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return results;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0.0;
            for (int i = 0; i<size; i++ ){
                TreeNode temp = queue.poll();
                sum+=temp.val;

                if (temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);
            }
            results.add( sum / size);
        }
        return results;

    }

}
