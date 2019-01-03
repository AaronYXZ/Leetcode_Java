package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/

Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]

S:
https://leetcode.com/problems/binary-tree-level-order-traversal-ii/discuss/34981/My-DFS-and-BFS-java-solution
 */

public class L107_BinaryTreeLevelOrderTraversal2 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> resultList = new LinkedList<List<Integer>>();

        if (root == null) return resultList;

        queue.offer(root);

        while(!queue.isEmpty()){
            int levelNum = queue.size();

            List<Integer> tempList = new LinkedList<>();
            for(int i = 0; i<levelNum; i++){
                TreeNode node = queue.peek();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                tempList.add(node.val);
                queue.poll();
            }
            resultList.add(0, tempList);
        }

        return resultList;
    }
}