package DepthFirstSearch;

import java.util.HashMap;
/*
https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given

inorder = [9,3,15,20,7]
postorder = [9,15,7,20,3]
Return the following binary tree:

    3
   / \
  9  20
    /  \
   15   7


https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/discuss/34782/My-recursive-Java-code-with-O(n)-time-and-O(n)-space
 */

public class L106_ConstructBinaryTreeFromInorderPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i], i);
        }
        return buildTreePostIn(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, hashMap);
    }

    private TreeNode buildTreePostIn(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, HashMap<Integer, Integer> hashMap) {
        TreeNode root = new TreeNode(postorder[pe]);
        int ri = hashMap.get(root);

        // ToDo why pe = ps+ri-is-1
        root.left = buildTreePostIn(inorder, is, ri-1, postorder, ps, ps+ri-is-1, hashMap);
        root.right = buildTreePostIn(inorder, ri+1, ie, postorder, ps + ri -is, pe-1, hashMap);
        return root;
    }
}
