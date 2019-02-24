package Tree_Traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L589_NaryTreePreorderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root){
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Deque<Node> deque = new ArrayDeque<>();
        deque.offerLast(root);
        while (!deque.isEmpty()){
            Node curr = deque.pollLast();
            result.add(curr.val);
            List<Node> children = curr.children;
            for (int i = children.size()-1; i>=0; i--){
                deque.offerLast(children.get(i));
            }
        }
        return result;
    }
}
