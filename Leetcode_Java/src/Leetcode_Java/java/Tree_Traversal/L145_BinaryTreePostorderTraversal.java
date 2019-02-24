package Tree_Traversal;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
https://leetcode.com/problems/binary-tree-postorder-traversal/description/
https://leetcode.com/problems/binary-tree-postorder-traversal/discuss/45551/Preorder-Inorder-and-Postorder-Iteratively-Summarization
 */
public class L145_BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode curr = root;
        while (curr != null || !deque.isEmpty()) {
            if (curr != null) {
                deque.offerLast(curr);
                result.addFirst(curr.val);  // Reverse the process of preorder
                curr = curr.right;             // Reverse the process of preorder
            } else {
                curr = deque.pollLast();
                curr = curr.left;           // Reverse the process of preorder
            }
        }
        return result;
    }
}
