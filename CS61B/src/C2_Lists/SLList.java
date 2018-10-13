package C2_Lists;

public class SLList {

    private static class IntNode {

        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            this.item = i;
            this.next = n;
        }
    }

    private IntNode sentinel;
    private int size;

    public SLList() {
        sentinel = new IntNode(63, null);
        // sentinel is a Node at the front of the List (63 is some random number that doesn't mean anything. It could be 0, 1, 99, 10000)
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    // Add x to the front of the list
    public void addFirst(int x) {
        // we don't modify sentinel node. We only insert the node in front of the previous first node
        // That is, we let sentinel point to the newly added first node, and let this node points to the previou first node
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    // Return the first item in the SLList
    public int getFirst() {
        return sentinel.next.item;
    }

    // Add x to the end of the list
    public void addLast(int x) {

        size = size + 1;
        /*
        Can't use p = sentinel.next, but p = sentinel to make sure p is not null,
        otherwise p.next will get NullPointerException

        IntNode p = sentinel.next;
        while (p != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
*/

        IntNode p = sentinel;
        // advance p to the end of the list
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }


    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList list = new SLList();
        list.addLast(10);
        System.out.println(list.sentinel.next.item);
    }

}
