package HashTable;

public class L706_DesignHashMap {

    class ListNode {

        int key, val;
        ListNode next;

        ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    final ListNode[] nodes = new ListNode[10000];
    int idx(int key) {
        return Integer.hashCode(key) % nodes.length;
    }

    public void put(int key, int value){
        int i = idx(key);
        if (nodes[i] == null) nodes[i] = new ListNode(-1, -1);
    }

    public static void main(String[] args) {
        System.out.println(Integer.hashCode('c'));
    }
}
