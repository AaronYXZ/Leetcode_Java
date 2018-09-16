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

    // The first item (if it exists) is at sentinel.next
    private IntNode first;
    private int size;

    public SLList() {
        first = new IntNode(63, null);
        size = 0;
    }

    public SLList(int x) {
        first = new IntNode(63, null);
        first.next = new IntNode(x, null);
        size = 1;
    }

    // Add x to the front of the list
    public void addFirst(int x) {
        first.next = new IntNode(x, first.next);
        size++;
    }

    // Return the first item in the SLList
    public int getFirst() {
        return first.next.item;
    }

    // Add x to the end of the list
    public void addLast(int x) {

        size = size + 1;
        /*
        Can't use last = sentinel.next, but last = sentinel to make sure last is not null,
        otherwise last.next will get NullPointerException

        IntNode last = sentinel.next;
        while (last != null){
            last = last.next;
        }
        last.next = new IntNode(x, null);
*/

        IntNode last = first;
        while (last.next != null){
            last = last.next;
        }
        last.next = new IntNode(x, null);
    }


    public int size(){
        return size;
    }

    public static void main(String[] args) {
        SLList list = new SLList();
        list.addLast(10);
        System.out.println(list.first.next.item);
    }

}
