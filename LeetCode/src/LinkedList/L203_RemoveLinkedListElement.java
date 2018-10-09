package LinkedList;

/*
Q:
https://leetcode.com/problems/remove-linked-list-elements/description/

Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
 */

public class L203_RemoveLinkedListElement {

    public ListNode removeElements(ListNode head, int val) {
        // navigate every node, let the dummy point to this node if it's value is not val
        // Careful with the last Node. Add else statement to make sure if the last Node value is val, it's not included in the final result
        ListNode dummy = new ListNode(0);
        ListNode sentinel = dummy;
        dummy.next = head;
        while (head != null){
            if (head.val != val) {
                dummy.next = head;
                dummy = dummy.next;
            }
            else {
                dummy.next = null;
            }
            head = head.next;
        }
        return sentinel.next;
    }
}
