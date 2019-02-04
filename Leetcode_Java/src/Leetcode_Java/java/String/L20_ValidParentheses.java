package String;

import java.util.HashMap;
import java.util.Stack;

/*
Q:
https://leetcode.com/problems/valid-parentheses/description/
S:
https://www.programcreek.com/2012/12/leetcode-valid-parentheses-java/

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 */

public class L20_ValidParentheses {

    public static boolean solution1(String s){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put( '{', '}');
        map.put('[' ,']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<s.length(); i++){
            char curr = s.charAt(i);
            if (map.containsKey(curr)){
                stack.push(curr);
            }
            else if (map.containsValue(curr)){
                if (!stack.isEmpty() && map.get(stack.peek()) == curr) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solution1("()"));
        System.out.println(solution1("()[]{}"));
        System.out.println(solution1("([)]"));
    }
}
