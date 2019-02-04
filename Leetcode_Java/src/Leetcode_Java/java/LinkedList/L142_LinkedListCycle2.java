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

Floyd's circle detection https://zh.wikipedia.org/wiki/Floyd%E5%88%A4%E5%9C%88%E7%AE%97%E6%B3%95

 */

public class L142_LinkedListCycle2 {
    public ListNode detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast.next != null){
            slow=slow.next;
            fast = fast.next.next;

            if (slow == fast){
                // when slow == fast, it's not guaranteed it's the start of the circle.

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

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        head.next = second;
        ListNode third = new ListNode(3);
        second.next = third;
        ListNode fourth = new ListNode(4);
        third.next = fourth;
        ListNode fifth = new ListNode(5);
        fourth.next = fifth;
        fifth.next = third;

        ListNode slow = head, fast = head;
        while(slow != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                break;
            }
        }
        System.out.println("pause");
    }
}
