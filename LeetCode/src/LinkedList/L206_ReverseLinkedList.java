package LinkedList;

import java.util.Stack;
/*
Q:
https://leetcode.com/problems/reverse-linked-list/description/

Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?


 */

public class L206_ReverseLinkedList {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return head;
        Stack<Integer> stack = new Stack<>();
        while (head != null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode sentinel = new ListNode(stack.pop());
        ListNode result = sentinel;
        while(!stack.empty()){
            sentinel.next = new ListNode(stack.pop());
            sentinel = sentinel.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(3);
        test.next.next.next = new ListNode(4);
        test.next.next.next.next = new ListNode(5);

        ListNode result = reverseList(test);
    }
}
