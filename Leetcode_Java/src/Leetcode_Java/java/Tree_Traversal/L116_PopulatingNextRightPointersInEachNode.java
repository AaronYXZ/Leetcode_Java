package Tree_Traversal;

/*
Q:
https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/

Given a binary tree

private class TreeLinkNode{
    TreeLinkNode left, right, next;
    int val;
}

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

You may only use constant extra space.
Recursive approach is fine, implicit stack space does not count as extra space for this problem.
You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
Example:

Given the following perfect binary tree,

     1
   /  \
  2    3
 / \  / \
4  5  6  7
After calling your function, the tree should look like:

     1 -> NULL
   /  \
  2 -> 3 -> NULL
 / \  / \
4->5->6->7 -> NULL

S:
https://leetcode.com/problems/populating-next-right-pointers-in-each-node/discuss/37461/Java-solution-with-O(1)-memory+-O(n)-time
 */

public class L116_PopulatingNextRightPointersInEachNode {
    private class TreeLinkNode{
        TreeLinkNode left, right, next;
        int val;
    }
    public void connect(TreeLinkNode root){
        TreeLinkNode level_start = root;
        while (level_start != null){
            TreeLinkNode curr = level_start;
            while(curr != null){
                if(curr.left != null) curr.left.next = curr.right;
                if(curr.right!= null && curr.next != null) curr.right.next = curr.next.left;
                curr = curr.next;
            }
            level_start = level_start.left;
        }
    }
}
