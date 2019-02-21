package Tree_Traversal;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/binary-tree-paths/description/
Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3

https://leetcode.com/problems/binary-tree-paths/discuss/68258/Accepted-Java-simple-solution-in-8-lines
 */

public class L257_BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        String path = "";
        // From root, path should start with empty string
        if (root != null) {
            BST(root, path, answer);
        }
        return answer;
    }

    public void BST(TreeNode root, String path, List<String> answer) {
        // answer is a list String that's going to be returned, each string inside it is a path.
        // every time, given a TreeNode, we check its left and right node. If both are null, we add the path to answer.
        // if not, we go one step deeper to its child nodes, continue to construct path there,
        // until reach the bottom (where node left and right are both null),
        // then we add path to the answer list
        if (root.left == null && root.right == null) {
            answer.add(path + root.val);
        }
        if (root.left != null) {
            BST(root.left, path + root.val + "->", answer);
        }
        if (root.right != null) {
            BST(root.right, path + root.val + "->", answer);
        }
    }
}
