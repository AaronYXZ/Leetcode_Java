package Tree;
/*
https://leetcode.com/problems/search-in-a-binary-search-tree/description/
Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value. Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.

For example,

Given the tree:
        4
       / \
      2   7
     / \
    1   3

And the value to search: 2
You should return this subtree:

      2
     / \
    1   3
In the example above, if we want to search the value 5, since there is no node with value 5, we should return NULL.

Note that an empty tree is represented by NULL, therefore you would see the expected output (serialized tree format) as [], not null.

https://leetcode.com/problems/search-in-a-binary-search-tree/discuss/149274/Java-beats-100-concise-method-using-recursion-and-iteration
 */

public class L700_SearchInaBST {
    public static TreeNode searchBST(TreeNode root, int val){
        if (root == null) return root;
        if (root.val == val) return root;
        else return root.val < val ? searchBST(root.right, val) : searchBST(root.left, val);
    }
}
