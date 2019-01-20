package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
// ToDo
/*
https://leetcode.com/problems/print-binary-tree/description/
 */

public class L655_PrintBinaryTree {
    public List<List<Integer>> printTree(TreeNode root){
        int height = getHeight(root);
        int[] helper = new int[height];
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;
        while (!queue.isEmpty()){
            int padding = (int) (Math.pow(2, height - depth) - 1);
//            int interval = (int) (Math.pow(2, ))

        }
        return result;

    }

    public int getHeight(TreeNode root){
        if (root == null) return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}
