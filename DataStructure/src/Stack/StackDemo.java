package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('c');
//        stack.pop();
        System.out.println(stack.peek());

        Deque<Integer> stack1 = new ArrayDeque<>();
        stack1.push(1);
        stack1.push(2);
        System.out.println(stack1.peek());

    }
}
