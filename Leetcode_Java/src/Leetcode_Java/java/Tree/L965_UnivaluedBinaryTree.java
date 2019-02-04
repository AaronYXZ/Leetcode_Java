package Tree;
/*
https://leetcode.com/problems/univalued-binary-tree/description/
A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.

Example 1:

Input: [1,1,1,1,1,null,1]
Output: true
Example 2:

Input: [2,2,2,5,2]
Output: false


Note:

The number of nodes in the given tree will be in the range [1, 100].
Each node's value will be an integer in the range [0, 99].
 */

import java.util.LinkedList;
import java.util.Queue;

public class L965_UnivaluedBinaryTree {

    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                TreeNode curr = queue.poll();
                if (curr.val != val) {
                    return false;
                }
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
        }
        return true;
    }
}
