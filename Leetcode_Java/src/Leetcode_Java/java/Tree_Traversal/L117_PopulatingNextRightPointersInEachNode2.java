package Tree_Traversal;

import java.util.ArrayDeque;
import java.util.Deque;
/*
https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/

 */

public class L117_PopulatingNextRightPointersInEachNode2 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val,Node _left,Node _right,Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect(Node root) {
        if (root == null) return root;
        Deque<Node> deque = new ArrayDeque<>();
        deque.offerLast(root);
        Node pre = null;
        while (!deque.isEmpty()){
            int size = deque.size();
            for (int i = 0; i < size; i++){
                Node curr = deque.pollFirst();
                if (pre != null){
                    pre.next = curr;
                }
                pre = curr;
                if (curr.left != null) deque.offerLast(curr.left);
                if (curr.right != null) deque.offerLast(curr.right);
            }
            pre = null;
        }
        return root;
    }
}
