package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
/*
https://leetcode.com/problems/valid-parentheses/description/
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
    public boolean isValid(String s){
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Deque<Character> deque = new ArrayDeque<>();
        for (char c:s.toCharArray()){
            if (map.containsKey(c)){
                deque.push(c);
            }
            else if (!deque.isEmpty() && map.get(deque.peek()) == c){
                deque.pop();
            }
            else{
                return false;
            }
        }

        return deque.isEmpty();
    }

    public boolean isValid2(String s){
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Deque<Character> deque = new ArrayDeque<>();
        for (char c:s.toCharArray()){
            if (map.containsKey(c)){
                deque.offerLast(c);
            }
            else if (!deque.isEmpty() && map.get(deque.peekLast()) == c){
                deque.pollLast();
            }
            else{
                return false;
            }
        }

        return deque.isEmpty();
    }
}
