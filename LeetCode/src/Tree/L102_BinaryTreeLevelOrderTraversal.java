package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
https://leetcode.com/problems/binary-tree-level-order-traversal/description/

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]

S:
https://leetcode.com/problems/binary-tree-level-order-traversal/discuss/33450/Java-solution-with-a-queue-used
 */

public class L102_BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> resultList = new LinkedList<List<Integer>>();

        if(root == null) return resultList;

        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> tempList = new LinkedList<>();
            int levelNum = queue.size();
            for (int i = 0; i < levelNum; i++){
                TreeNode node = queue.peek();
                if (node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                tempList.add(node.val);
                queue.poll();
            }
            resultList.add(tempList);
        }

        return resultList;
    }
}
