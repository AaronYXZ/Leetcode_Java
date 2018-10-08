package LinkedList;

/*
Q:
https://leetcode.com/problems/swap-nodes-in-pairs/description/

Given a linked list, swap every two adjacent nodes and return its head.

Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.
Note:

Your algorithm should use only constant extra space.
You may not modify the values in the list's nodes, only nodes itself may be changed.

S:
https://leetcode.com/problems/swap-nodes-in-pairs/discuss/11046/My-simple-JAVA-solution-for-share
 */

public class L24_SwapNodesInPairs {

    public ListNode swapPairs(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next!=null){
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }

        return dummy.next;
    }
}
