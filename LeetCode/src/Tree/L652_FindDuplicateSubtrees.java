package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
https://leetcode.com/problems/find-duplicate-subtrees/description/
Given a binary tree, return all duplicate subtrees. For each kind of duplicate subtrees, you only need to return the root node of any one of them.

Two trees are duplicate if they have the same structure with same node values.

Example 1:

        1
       / \
      2   3
     /   / \
    4   2   4
       /
      4
The following are two duplicate subtrees:

      2
     /
    4
and

    4
Therefore, you need to return above trees' root in the form of a list.

https://leetcode.com/problems/find-duplicate-subtrees/discuss/106011/Java-Concise-Postorder-Traversal-Solution
 */

public class L652_FindDuplicateSubtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root){
        List<TreeNode> result = new ArrayList<>();
        postorder(root, new HashMap<String, Integer>(), result);
        return result;
    }

    public String postorder(TreeNode curr, HashMap<String, Integer> map,  List<TreeNode> result){
        if (curr == null) return "#";
        String serial = curr.val + postorder(curr.left, map, result) + postorder(curr.right, map, result);
        if (map.getOrDefault(serial, 0) == 1) result.add(curr);
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        return serial;
    }
}
