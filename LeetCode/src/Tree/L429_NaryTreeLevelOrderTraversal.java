package Tree;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
https://leetcode.com/problems/n-ary-tree-level-order-traversal/description/

Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example, given a 3-ary tree:


We should return its level order traversal:

[
     [1],
     [3,2,4],
     [5,6]
]


Note:

The depth of the tree is at most 1000.
The total number of nodes is at most 5000.
 */

public class L429_NaryTreeLevelOrderTraversal {

    private static class Node {

        int val;
        List<Node> children;
        Node(int _val, List<Node> _children){
            val = _val;
            children = _children;
        }
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int levelNum = queue.size();
            for (int i = 0; i < levelNum; i++) {
                Node curr = queue.poll();
                temp.add(curr.val);
                if (curr.children != null) {
                    List<Node> children = curr.children;

                    for (Node child : children)
                        queue.offer(child);
                }
            }
            result.add(temp);

        }
        return result;
    }

    public static void main(String[] args) {
        Node c2 = new Node(2, new ArrayList<Node>());
        Node c3 = new Node(4, new ArrayList<Node>());
        Node cc1 = new Node(5, new ArrayList<Node>());
        Node cc2 = new Node(6, new ArrayList<Node>());

        Node c1 = new Node(3, Arrays.asList(cc1, cc2));
        Node root = new Node(1, Arrays.asList(c1, c2, c3));
        List<List<Integer>> result = levelOrder(root);
        System.out.println("hello");
    }
}
