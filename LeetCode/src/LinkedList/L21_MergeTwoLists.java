package LinkedList;

import static LinkedList.L19_RemoveNthNodeFromEndOfList.ListNode;

public class L21_MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        while (l1.next!=null || l2.next!= null){
            int v1 = l1.val;
            int v2 = l2.val;
            if(v1 >= v2) {
                head.next = new ListNode(v1);
                l1 = l1.next;
            }
            else {
                head.next = new ListNode(v2);
                l2 = l2.next;
            }
        }

        return head;
    }
