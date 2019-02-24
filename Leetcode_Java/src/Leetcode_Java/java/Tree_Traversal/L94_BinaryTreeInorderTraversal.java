package Tree_Traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
Q:
https://leetcode.com/problems/binary-tree-inorder-traversal/description/

S:
https://leetcode.com/problems/binary-tree-inorder-traversal/discuss/31213/Iterative-solution-in-Java-simple-and-readable
 */
public class L94_BinaryTreeInorderTraversal {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode cur = root;
        while (cur != null || !deque.isEmpty()) {
            while (cur != null) {
                deque.add(cur);
                cur = cur.left;
            } // push all the left node to the stack

            cur = deque.pop();
            list.add(cur.val);
            cur = cur.right;
        }

        return list;

    }

    public List<Integer> inorderTraversal2(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode curr = root;
        while (curr != null || !deque.isEmpty()){
            if (curr != null){ // get the leftmost node while push every left node to deque
                deque.offerLast(curr);
                curr = curr.left;
            }
            else{ // start from adding the left node to list, keep adding by poping the node from deque, stop to visit
                // the right whenever left and parent has been added to list
                curr = deque.pollLast();
                result.add(curr.val);
                curr = curr.right;
            }
        }
        return result;
    }
}