package Tree_Traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
/*
https://leetcode.com/problems/find-mode-in-binary-search-tree/description/
Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.


For example:
Given BST [1,null,2,2],

   1
    \
     2
    /
   2


return [2].

Note: If a tree has more than one mode, you can return them in any order.

Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).
https://leetcode.com/problems/find-mode-in-binary-search-tree/discuss/98100/Java-4ms-Beats-100-Extra-O(1)-solution-No-Map
 */

public class L501_FindModeInBinarySearchTree {

    public static int[] findMode(TreeNode root) {
        // Travese the tree in-order to get the max occurance, as well as a list of nodes with such occurances
        // convert the list to array
        int maxOccur = 0;
        int count = 1;
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode curr = root;
        TreeNode pre = null;
        while (curr != null || !deque.isEmpty()) {
            while (curr != null) {
                deque.push(curr);
                curr = curr.left;
            }
            curr = deque.pop();
            if (pre != null) {
                if (curr.val == pre.val) {
                    count++;
                } else {
                    count = 1;
                }
            }
            if (count > maxOccur) {
                list.clear();
                maxOccur = count;
                list.add(curr.val);
            } else if (count == maxOccur) {
                list.add(curr.val);
            }
            pre = curr;
            curr = curr.right;
        }
//        for
//        return list.toArray();
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
//        deque.clear();
//        pre = null;
//        curr = root;
//        count = 1;
//        int index = 0;
//        while (curr != null || !deque.isEmpty()) {
//            while (curr != null) {
//                deque.push(curr);
//                curr = curr.left;
//            }
//            curr = deque.pop();
//            if (pre != null) {
//                if (curr.val == pre.val) {
//                    count++;
//                } else {
//                    count = 1;
//                }
//            }
//            if (count == maxOccur) {
//                result[index] = curr.val;
//                index++;
//            }
//            pre = curr;
//            curr = curr.right;
//        }
//
//        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        int[] result = findMode(root);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
