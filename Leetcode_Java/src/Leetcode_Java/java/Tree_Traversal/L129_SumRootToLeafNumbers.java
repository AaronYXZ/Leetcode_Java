package Tree_Traversal;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/sum-root-to-leaf-numbers/description/

Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

Note: A leaf is a node with no children.

Example:

Input: [1,2,3]
    1
   / \
  2   3
Output: 25
Explanation:
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.
Therefore, sum = 12 + 13 = 25.
Example 2:

Input: [4,9,0,5,1]
    4
   / \
  9   0
 / \
5   1
Output: 1026
Explanation:
The root-to-leaf path 4->9->5 represents the number 495.
The root-to-leaf path 4->9->1 represents the number 491.
The root-to-leaf path 4->0 represents the number 40.
Therefore, sum = 495 + 491 + 40 = 1026.
 */
public class L129_SumRootToLeafNumbers {

// learns from L257——BinaryTreePaths: maintain a list of interger called answer and a integer called sumSoFar
    // starts from the root node, with sumSoFar being root.val, every time we go to its child, we update using sumSoFar = sumSofar * 10 + root.child.val
    // until we reaches the bottom of the tree, by root.left == null and root.right == null. Then we put sumSoFar in the answer list
    // finally we return the sum of the answer list
    public int sumNumbers(TreeNode root){
        List<Integer> answer = new ArrayList<>();
        if (root == null) return 0;
        sumFrom(root, 0, answer);
        int result = 0;
        for (int a:answer){
            result += a;
        }
        return result;
    }

    public void sumFrom(TreeNode root, int sumSoFar,List<Integer> answer){
        if (root.left == null && root.right == null){
            answer.add(sumSoFar * 10 + root.val);
        }
        if(root.left != null) sumFrom(root.left, sumSoFar * 10 + root.val, answer);
        if (root.right != null) sumFrom(root.right, sumSoFar * 10 + root.val, answer);
    }
}
