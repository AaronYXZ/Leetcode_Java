package LinkedList;

public class L83_RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode start = head, dummy = head;
        int currentVal = head.val;

        while (start.next != null){
            if (start.next.val > currentVal) {
                dummy.next = start.next;
                dummy = dummy.next;
                currentVal = start.next.val;

            }
            start = start.next;
        }
        if (start.val > currentVal) dummy.next = start;
        else dummy.next = null;
        return head;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(1);
        head.next = second;
        ListNode third = new ListNode(2);
        second.next = third;
        ListNode fourth = new ListNode(3);
        third.next = fourth;
        ListNode fifth = new ListNode(3);
        fourth.next = fifth;

        ListNode result =  deleteDuplicates(head);
        System.out.println("pause");

    }

}
