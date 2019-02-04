package LinkedList;

import java.util.HashMap;
import java.util.Map;

/*
Q:
https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/

Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->5
Example 2:

Input: 1->1->1->2->3
Output: 2->3
 */

public class L82_RemoveDuplicatesFromSortedList2 {

    // Personal's naive approach, loop through the list first, find duplicates and store in a map.
    // then loop through again, let result points to the ListNode that are not duplicate
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode sentinel = new ListNode(0);
        ListNode result = sentinel;
        sentinel.next = head;
        ListNode dummy = head, dummy2 = head;
        Map<Integer, Integer> map = new HashMap<>();
        while (dummy != null){
            map.put(dummy.val, map.getOrDefault(dummy.val, 0) + 1);
            dummy = dummy.next;
        }
        // map.put(dummy.val, map.getOrDefault(dummy.val, 0) + 1);

        while (dummy2 != null){
            if (map.get(dummy2.val) == 1)
            {
                sentinel.next = dummy2;
                sentinel = sentinel.next;

            } else
            {
                sentinel.next = null;
            }
            dummy2 = dummy2.next;
        }
        return result.next;
    }
    public static ListNode deleteDuplicatesEffecient(ListNode head){

        // S: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/discuss/28335/My-accepted-Java-code
        if(head==null) return null;
        ListNode FakeHead=new ListNode(0);
        FakeHead.next=head;
        ListNode pre=FakeHead;
        ListNode cur=head;
        while(cur!=null){
            while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur){
                pre=pre.next;
            }
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return FakeHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(1);
        head.next = second;
//        ListNode third = new ListNode(1);
//        second.next = third;
//        ListNode fourth = new ListNode(2);
//        third.next = fourth;
//        ListNode fifth = new ListNode(3);
//        fourth.next = fifth;

        ListNode result =  deleteDuplicates(head);
        System.out.println("pause");

    }

}
