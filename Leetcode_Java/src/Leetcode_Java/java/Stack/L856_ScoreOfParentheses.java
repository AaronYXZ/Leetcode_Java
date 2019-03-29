package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
/*
https://leetcode.com/problems/score-of-parentheses/
Given a balanced parentheses string S, compute the score of the string based on the following rule:

() has score 1
AB has score A + B, where A and B are balanced parentheses strings.
(A) has score 2 * A, where A is a balanced parentheses string.


Example 1:

Input: "()"
Output: 1
Example 2:

Input: "(())"
Output: 2
Example 3:

Input: "()()"
Output: 2
Example 4:

Input: "(()(()))"
Output: 6
https://leetcode.com/problems/score-of-parentheses/discuss/141777/C%2B%2BJavaPython-O(1)-Space
 */

public class L856_ScoreOfParentheses {
    public int score(String S){
        Deque<Integer> deque = new ArrayDeque<>();
        int cur = 0;
        for (char c:S.toCharArray()){
            if (c == '('){
                deque.offerLast(cur);
                cur = 0;
            }
            else{
                cur = deque.pollLast() + Math.max(cur * 2, 1);
            }
        }
        return cur;
    }
}
