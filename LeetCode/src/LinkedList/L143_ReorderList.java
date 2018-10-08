package LinkedList;

/*
Q:
https://leetcode.com/problems/reorder-list/description/

Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You may not modify the values in the list's nodes, only nodes itself may be changed.

Example 1:

Given 1->2->3->4, reorder it to 1->4->2->3.
Example 2:

Given 1->2->3->4->5, reorder it to 1->5->2->4->3.

S:
https://leetcode.com/problems/reorder-list/discuss/44992/Java-solution-with-3-steps
 */

public class L143_ReorderList {
    public void reorderList(ListNode head){
        if (head == null || head.next == null) return;

        // step 1: find the middle of the list
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // step 2: Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode preMiddle=slow;
        ListNode preCurrent=slow.next;
        while(preCurrent.next!=null){
            ListNode current=preCurrent.next;
            preCurrent.next=current.next;
            current.next=preMiddle.next;
            preMiddle.next=current;
        }

        // step 3: Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
        slow=head;
        fast=preMiddle.next;
        while(slow!=preMiddle){
            preMiddle.next=fast.next;
            fast.next=slow.next;
            slow.next=fast;
            slow=fast.next;
            fast=preMiddle.next;
        }


    }


}
