package Tree_Traversal;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
/*
https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/

https://leetcode.com/problems/n-ary-tree-postorder-traversal/discuss/147959/Java-Iterative-and-Recursive-Solutions
 */

public class L590_NaryTreePostorderTraversal {
    private class Node{
        private int val;
        private List<Node> children;
    }
    public List<Integer> postorder(Node root){
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) return result;

        Deque<Node> deque = new ArrayDeque<>();
        deque.offerLast(root);
        while(!deque.isEmpty()){
            Node curr = deque.pollLast();
            result.addFirst(curr.val);
            for (Node node:curr.children){
                deque.offerLast(node);
            }
        }
        return result;
    }
}
