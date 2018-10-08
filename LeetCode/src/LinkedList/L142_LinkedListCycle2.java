package LinkedList;

/*
Q:
https://leetcode.com/problems/linked-list-cycle-ii/description/

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Note: Do not modify the linked list.

Follow up:
Can you solve it without using extra space?

S:
https://leetcode.com/problems/linked-list-cycle-ii/discuss/44774/Java-O(1)-space-solution-with-detailed-explanation.
 */

public class L142_LinkedListCycle2 {
    public ListNode detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast.next != null){
            slow=slow.next;
            fast = fast.next.next;

            if (slow == fast){
                ListNode slow2 = head;
                while (slow2 != slow){
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }

        return null;
    }
}
