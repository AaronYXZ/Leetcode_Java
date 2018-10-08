package LinkedList;

import java.util.List;
/*
q:
https://leetcode.com/problems/remove-nth-node-from-end-of-list/discuss/8804/Simple-Java-solution-in-one-pass

Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?

S:
https://leetcode.com/problems/remove-nth-node-from-end-of-list/discuss/8804/Simple-Java-solution-in-one-pass
 */

public class L19_RemoveNthNodeFromEndOfList {

    public static ListNode removeNthFromEnd1Pass(ListNode head, int n){
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        for (int i = 0; i<= n; i++){
            fast = fast.next;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start;
        ListNode fast = start;
        slow.next = head;
        while (n >0){
            fast = fast.next;
            n--;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {

    }
}
