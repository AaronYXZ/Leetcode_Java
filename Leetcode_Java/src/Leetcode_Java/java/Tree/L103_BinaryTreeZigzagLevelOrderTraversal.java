package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/

Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
 */

public class L103_BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        // Learns from L102 BinaryTreeLevelOrderTraversal
        // use iterative approach. Use queue to keep node on each level, create list to hold all values on each level
        // The only difference is adding a parameter depth, the level #, to decide whether list should be reversed to form zig zag traversal
        List<List<Integer>> results = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return results;
        queue.offer(root);

        int depth = 0;
        while (!queue.isEmpty()){
            depth++;
            int levelSize = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i<levelSize; i++){
                TreeNode curr = queue.poll();
                temp.add(curr.val);
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
            if (depth % 2 == 1){
                results.add(temp);
            }
            else{
                Collections.reverse(temp);
                results.add(temp);
            }
        }

        return results;

    }
}
