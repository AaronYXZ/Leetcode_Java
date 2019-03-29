package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.

Formally, a parentheses string is valid if and only if:

It is the empty string, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.



Example 1:

Input: "())"
Output: 1
Example 2:

Input: "((("
Output: 3
Example 3:

Input: "()"
Output: 0
Example 4:

Input: "()))(("
Output: 4
 */
public class L921_MinimumAddToMakeParenthesesValid {
    // Logic is pretty simple， there are only two cases of invalid paretheses:
    // 1. ) with no left ( or 2.  ( with no right )
    // so use a deque to record all (, whenever there's a match, remove that (
    // the result should be sum of unmatched ) and left ( on the deque
    public int minAddToMakeValid(String S) {
        int sum = 0;
        Deque<Character> deque = new ArrayDeque<>();
        for (char s : S.toCharArray()){
            if (s == '('){
                deque.offerLast(s);
            }
            else if (deque.isEmpty()){
                sum++;
            }
            else{
                deque.pollLast();
            }
        }
        return sum + deque.size();
    }
}
