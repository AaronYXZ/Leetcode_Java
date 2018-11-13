package BinarySearchTree;

// Algorithms Page 398

public class BST<Key extends Comparable<Key>, Value> {
    /*
    This implementation of the ordered symbol-table API uses a binary search tree built from Node objects
     that each contain a key, associated value, two links, and a node count N. Each Node is the root of a
     subtree containing N nodes, with its left link pointing to a Node that is the root of a subtree with smaller
      keys and its right link pointing to a Node that is the root of a subtree with larger keys. The instance
      variable root points to the Node at the root of the BST (which has all the keys and associ- ated values in
      the symbol table).
     */

    /*
    These implementations of get() and put() for the symbol-table API are characteristic recursive BST methods
    that also serve as models for several other implementations that we consider later in the chapter. Each
    method can be understood as both working code and a proof by induction of the inductive hypothesis in the
    opening comment.
     */

    private Node root;

    private class Node {

        private Key key;
        private Value val;
        private Node left, right;
        private int N;

        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.N;
        }
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        // Return value associated with key in the subtree rooted at x;
        // return null if key not present in subtree rooted at x.
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return get(x.left, key);
        } else if (cmp > 0) {
            return get(x.right, key);
        } else {
            return x.val;
        }
    }

    public void put(Key key, Value val) {
        put(root, key, val);
    }

    private Node put(Node x, Key key, Value value) {
        // Change key’s value to val if key in subtree rooted at x.
        // Otherwise, add new node to subtree associating key with val.
        if (x == null) {
            return new Node(key, value, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else {
            x.val = value;
        }
        //        x.N = size(x) + 1 differece from below line?
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }
}
