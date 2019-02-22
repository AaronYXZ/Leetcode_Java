package Tree;

import java.util.ArrayDeque;
import java.util.Deque;
/*
https://leetcode.com/problems/cousins-in-binary-tree/description/

 */
public class L993_CousinsInBinaryTree {

    // Do level order traversal, for each level, check each Node's child nodes to see if their val matches x or y
    // if yes, set parentX/Y to the parent (not the child node)
    // at the end of each level traveral, check if both x and y has parent and if parent are the same
    public static boolean isCousins(TreeNode root, int x, int y) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offerLast(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            TreeNode parentX = null, parentY = null;
            for (int i = 0; i < size; i++) {
                TreeNode curr = deque.pollFirst();
                TreeNode left = curr.left;
                TreeNode right = curr.right;
                if (left != null) {
                    deque.offerLast(left);
                    if (left.val == x) parentX = curr;
                    if (left.val == y) parentY = curr;
                }
                if (right != null) {
                    deque.offerLast(right);
                    if (right.val == x) parentX = curr;
                    if (right.val == y) parentY = curr;
                }
            }
            if (parentX != null && parentY != null && parentX != parentY) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        //        root.right.right = new TreeNode(5);
        System.out.println(isCousins(root, 2, 3));
    }
}
