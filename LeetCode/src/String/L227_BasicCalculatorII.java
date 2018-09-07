package String;

import java.util.Stack;

import static java.lang.Character.isDigit;

/*
Q:
https://leetcode.com/problems/basic-calculator-ii/description/
S:
https://leetcode.com/problems/basic-calculator-ii/discuss/63003/Share-my-java-solution

 */

// Use num to store the current number, and calculate if it's multiple digits.
// Whenever encounters a sign, if it's +, -, store the num to stack ; it it's *, /, get the previous number
// by stack.pop and * or / with the current num, store it to stack.
// Basically, go through every char in string, digit then store to num, sign +- then store num to stack;
// sign */ then use num right away and store the result to stack

// 123+4*5/6-2

public class L227_BasicCalculatorII {

    public static int calculate(String s) {
        int len = s.length();
        if (s == null || len == 0) return 0;
        int num = 0;
        Stack<Integer> stack = new Stack<>();
        char sign = '+';

        for (int i = 0; i < len; i++) {
            if (isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if ((!isDigit(s.charAt(i)) && ' ' != s.charAt(i)) || i == len - 1) {
                if (sign == '-') stack.push(-num);
                if (sign == '+') stack.push(num);
                if (sign == '*') stack.push(stack.pop() * num);
                if (sign == '/') stack.push(stack.pop() / num);
                sign = s.charAt(i);
                num = 0;
            }
        }
        int re = 0;
        for (int i:stack){
            re+=i;
        }
        return re;

    }
}
