package Backtracking;

import java.util.ArrayList;
import java.util.List;
/*
https://leetcode.com/problems/generate-parentheses/description/

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]

https://leetcode.com/problems/generate-parentheses/discuss/10100/Easy-to-understand-Java-backtracking-solution
 */

public class L22_GenerateParentheses {
    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        helper(res, n, 0, "");
        return res;
    }

    private void helper(List<String> res, int left, int right, String s){
        if (left == 0 && right == 0){
            res.add(s);
            return;
        }
        if (left > 0) helper(res, left-1, right + 1, s + "(");
        if (right > 0) helper(res, left, right -1, s + ")");
    }

    public static void main(String[] args) {
        int n = 2;
        L22_GenerateParentheses test = new L22_GenerateParentheses();
        test.generateParenthesis(2);
    }
}
