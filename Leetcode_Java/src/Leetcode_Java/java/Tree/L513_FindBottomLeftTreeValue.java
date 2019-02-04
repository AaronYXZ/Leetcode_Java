package Tree;

import java.util.LinkedList;
import java.util.Queue;
/*
https://leetcode.com/problems/find-bottom-left-tree-value/description/

Given a binary tree, find the leftmost value in the last row of the tree.

Example 1:
Input:

    2
   / \
  1   3

Output:
1
Example 2:
Input:

        1
       / \
      2   3
     /   / \
    4   5   6
       /
      7

Output:
7
Note: You may assume the tree (i.e., the given root node) is not NULL.

https://leetcode.com/problems/find-bottom-left-tree-value/discuss/98779/Right-to-Left-BFS-(Python-+-Java)
 */

public class L513_FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root){
        int result = root.val;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            for (int i = 0; i < queue.size(); i++){
                // this loop is useful only when we want depth of the tree
                // for a better BFS, check findBottotBFS below
                TreeNode curr = queue.poll();
                result = curr.val;
                if (curr.right != null) queue.offer(curr.right);
                if (curr.left != null) queue.offer(curr.left);
            }
        }
        return result;
    }

    public int findBottomBFS(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            root = queue.poll();
            if (root.right != null) queue.offer(root.right);
            if (root.left != null) queue.offer(root.left);
        }
        return root.val;
    }
}
