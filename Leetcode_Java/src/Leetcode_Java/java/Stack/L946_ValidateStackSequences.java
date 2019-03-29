package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
/*
https://leetcode.com/problems/validate-stack-sequences/
Given two sequences pushed and popped with distinct values, return true if and only if this could have been the result of a sequence of push and pop operations on an initially empty stack.



Example 1:

Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4), pop() -> 4,
push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
Example 2:

Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
Output: false
Explanation: 1 cannot be popped before 2.


Note:

0 <= pushed.length == popped.length <= 1000
0 <= pushed[i], popped[i] < 1000
pushed is a permutation of popped.
pushed and popped have distinct values.

https://leetcode.com/problems/validate-stack-sequences/discuss/197667/Java-straight-forward-stack-solution.
 */

public class L946_ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // Loop through the pushed array,
        //
        //Keep pushing pushed elements into stack if the top element on the stack is different from the current one of popped;
        //Keep poping out of the top element if it is same as the current one of popped;
        //Check if the stack is empty after loop.
        int index = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (Integer p : pushed) {
            deque.offerLast(p);
            while (deque.peekLast() == popped[index] && !deque.isEmpty()) {
                index++;
                deque.pollLast();
            }
        }
        return deque.isEmpty();
    }
}
