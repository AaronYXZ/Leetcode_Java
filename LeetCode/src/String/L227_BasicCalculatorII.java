package String;

import java.util.Stack;

import static java.lang.Character.isDigit;

/*
Q:
https://leetcode.com/problems/basic-calculator-ii/description/
S:
https://leetcode.com/problems/basic-calculator-ii/discuss/63003/Share-my-java-solution

 */

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
