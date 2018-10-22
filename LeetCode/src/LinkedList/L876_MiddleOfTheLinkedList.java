package LinkedList;
/*
Q:
https://leetcode.com/problems/middle-of-the-linked-list/description/

Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.

Example 1:

Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
Note that we returned a ListNode object ans, such that:
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
Example 2:

Input: [1,2,3,4,5,6]
Output: Node 4 from this list (Serialization: [4,5,6])
Since the list has two middle nodes with values 3 and 4, we return the second one.


Note:

The number of nodes in the given list will be between 1 and 100.
 */

public class L876_MiddleOfTheLinkedList {


    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            // check fast.next != null first, otherwise gets java.lang.NullPointerException
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next != null) {
            slow = slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode head =new  ListNode(1);
        ListNode second = new ListNode(2);
        head.next = second;
        ListNode third = new ListNode(3);
        second.next = third;
        ListNode fourth = new ListNode(4);
        third.next = fourth;
        ListNode fifth = new ListNode(5);
        fourth.next = fifth;
//        System.out.printf("" + fourth.next.next.val);
    }
}