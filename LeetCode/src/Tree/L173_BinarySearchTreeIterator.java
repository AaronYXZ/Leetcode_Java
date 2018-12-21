package Tree;


/*
Q:
https://leetcode.com/problems/binary-search-tree-iterator/description/

Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.


S:
https://leetcode.com/problems/binary-search-tree-iterator/discuss/52526/Ideal-Solution-using-Stack-(Java)
 */
import java.util.Stack;

public class L173_BinarySearchTreeIterator {
    private Stack<TreeNode> stack;
    public L173_BinarySearchTreeIterator(TreeNode root) {
        stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null){
            stack.push(cur);
            if (cur.left != null){
                cur = cur.left;
            }
            else
                break;
        }
    }


    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        TreeNode cur = node;
        // traversal right branch
        if(cur.right != null){
            cur = cur.right;
            while(cur != null){
                stack.push(cur);
                if(cur.left != null)
                    cur = cur.left;
                else
                    break;
            }
        }
        return node.val;
    }

}
