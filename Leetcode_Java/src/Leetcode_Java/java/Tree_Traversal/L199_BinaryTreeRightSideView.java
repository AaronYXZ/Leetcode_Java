package Tree_Traversal;

import java.util.ArrayList;
import java.util.List;
/*
https://leetcode.com/problems/binary-tree-right-side-view/description/

Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example:

Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---

 https://leetcode.com/problems/binary-tree-right-side-view/discuss/56012/My-simple-accepted-solution(JAVA)
 */

public class L199_BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        helper(root, result, 0);
        return result;

    }
    public void helper(TreeNode root, List<Integer> result, int depth){
        if (root == null) return;

        if (depth == result.size()){
            result.add(root.val);
        }

        helper(root.right, result, depth + 1);
        helper(root.left, result, depth + 1);
    }
}
