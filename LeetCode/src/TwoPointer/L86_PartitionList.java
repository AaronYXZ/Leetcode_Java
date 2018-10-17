package TwoPointer;


/*

Q:
https://leetcode.com/problems/partition-list/description/

Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

Example:

Input: head = 1->4->3->2->5->2, x = 3
Output: 1->2->2->4->3->5

S:
https://leetcode.com/problems/partition-list/discuss/29183/Concise-java-code-with-explanation-one-pass
 */
public class L86_PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode pre = new ListNode(0);
        ListNode post = new ListNode(0);
        ListNode dummyPre = pre;
        ListNode dummyPost = post;

        while (head != null){
            if (head.val < x){
                pre.next = head;
                pre = pre.next;
            }
            else {
                post.next = head;
                post = post.next;
            }

            head= head.next;
        }

        pre.next = dummyPost.next;
        post.next = null;

        return dummyPre.next;

    }

}
