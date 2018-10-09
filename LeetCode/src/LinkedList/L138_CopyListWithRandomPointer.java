package LinkedList;

public class L138_CopyListWithRandomPointer {

    // ToDo

    public class RandomListNode {

        int label;
        RandomListNode next, random;

        RandomListNode(int x) { this.label = x; }
    }

    public RandomListNode copyRandomList(RandomListNode head) {

        RandomListNode iter = head, next;
        // First round: make copy of each node,
        // and link them together side-by-side in a single list.
        while(iter != null){
            next = iter.next;

            RandomListNode copy = new RandomListNode(iter.label);
            iter.next = copy;
            copy.next = next;

            iter = next;
        }
        return iter;
    }
}
