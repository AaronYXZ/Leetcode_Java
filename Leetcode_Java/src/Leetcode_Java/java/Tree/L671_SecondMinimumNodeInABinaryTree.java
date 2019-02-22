package Tree;

import java.util.ArrayDeque;
import java.util.Deque;

/*
https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/description/
Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes.

Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.

If no such second minimum value exists, output -1 instead.

Example 1:
Input:
    2
   / \
  2   5
     / \
    5   7

Output: 5
Explanation: The smallest value is 2, the second smallest value is 5.
Example 2:
Input:
    2
   / \
  2   2

Output: -1
Explanation: The smallest value is 2, but there isn't any second smallest value.
 */
public class L671_SecondMinimumNodeInABinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        // According to question description, the child val of a node can only be larger or equal than the root val
        // Use Breadth first traversal to go thru every child node, pick the smallest value among them, and it must
        // be the second smallest (root val is always the smallest)
        // check if all val are the same, in that case return -1
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);
        int smallest = root.val;
        int second = Integer.MAX_VALUE;
        while (!deque.isEmpty()){
            TreeNode curr = deque.pop();
            if (curr.val < second && curr.val != smallest){
                second = curr.val;
            }

            if(curr.left != null) deque.push(curr.left);
            if (curr.right != null) deque.push(curr.right);
        }
        return (second == Integer.MAX_VALUE) ? -1 : second;
    }
}
