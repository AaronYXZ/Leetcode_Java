package Tree;


/*
https://leetcode.com/problems/insert-into-a-binary-search-tree/description/

Given the root node of a binary search tree (BST) and a value to be inserted into the tree, insert the value into the BST. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Note that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.

For example,

Given the tree:
        4
       / \
      2   7
     / \
    1   3
And the value to insert: 5
You can return this binary search tree:

         4
       /   \
      2     7
     / \   /
    1   3 5
This tree is also valid:

         5
       /   \
      2     7
     / \
    1   3
         \
          4
https://leetcode.com/problems/insert-into-a-binary-search-tree/discuss/150757/java-iterative-100
 */
public class L701_InsertIntoBST {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode curr = root;

        while (true) {
            if (val < curr.val) {
                if (curr.left == null) {
                    curr.left = new TreeNode(val);
                    break;
                } else {
                    curr = curr.left;
                }
            }
            else{
                if (curr.right == null){
                    curr.right = new TreeNode(val);
                    break;
                }
                else{
                    curr = curr.right;
                }
            }
        }
        return root;
    }
}
