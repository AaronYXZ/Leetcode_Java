package Design;

import java.util.ArrayDeque;
import java.util.Deque;
/*
https://leetcode.com/problems/min-stack/description/
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.

https://leetcode.com/problems/min-stack/discuss/49014/Java-accepted-solution-using-one-stack
 */

// The biggest challenge here is if the top of stack is min, after we pop it, we no longer have the new min
// The below solution always hold second smallest value right below the min. So that after we pop the min, we could
// assign the min to the previous second smallest value.
public class L155_MinStack {
    int min = Integer.MAX_VALUE;
    Deque<Integer> deque = new ArrayDeque<>();
    public L155_MinStack(){

    }
    public void push(int x){
        // only push the old minimum value when the current minimum value changes after pushing the new value x
        // so that the previous min is always right under the new min
        if (x <=min){
            deque.push(min);
            min = x;
        }
        deque.push(x);
    }
    public void pop(){
        // if pop operation could result in the changing of the current minimum value,
        // pop twice and change the current minimum value to the last minimum value.
        if (deque.pop() == min){
            min = deque.pop();
        }

    }
    public int top(){
        return deque.peek();
    }

    public int getMin(){
        return min;
    }

}
