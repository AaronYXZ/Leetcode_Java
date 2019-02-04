package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/leaf-similar-trees/description/
Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.


    3
   /  \
  5    1
 /\   / \
6  2 9   8
  /\
 7  4
For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.



Note:

Both of the given trees will have between 1 and 100 nodes.
 */

public class L872_LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2){
        List<Integer> lf1 = new ArrayList<>();
        List<Integer> lf2 = new ArrayList<>();
        getLeaf(root1, lf1);
        getLeaf(root2, lf2);
        if (lf1.size() != lf2.size()) return false;
        for (int i = 0; i<lf1.size(); i++){
            if (lf1.get(i) != lf2.get(i)) return false;
        }
        return true;
    }

    public void getLeaf(TreeNode root, List<Integer> lf){
        if (root == null) return;
        if (root.left == null && root.right == null) lf.add(root.val);
        getLeaf(root.left, lf);
        getLeaf(root.right, lf);
    }
}
