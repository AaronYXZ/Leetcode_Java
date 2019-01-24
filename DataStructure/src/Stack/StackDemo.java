package Stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('c');
        stack.pop();
        System.out.println(stack.peek());
    }
}
