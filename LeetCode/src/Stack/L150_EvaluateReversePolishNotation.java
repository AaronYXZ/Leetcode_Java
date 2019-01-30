package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Note:

Division between two integers should truncate toward zero.
The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.
Example 1:

Input: ["2", "1", "+", "3", "*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
Example 2:

Input: ["4", "13", "5", "/", "+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
Example 3:

Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
Output: 22
Explanation:
  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22

Idea is simple: use stack (ArrayDeque) to store every int, whenever there's a symbol, poll 2 item (from end of deck)
and calculate, then add to last of deque. Do this unitl all item in String[] are evaluated
 */
public class L150_EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens){
        Deque<Integer> deque = new ArrayDeque<>();
        Set<String> set = new HashSet<>(Arrays.asList("+", "-", "*", "/"));

        for(String token:tokens){
            if (!set.contains(token)){
                deque.addLast(Integer.valueOf(token));
            }
            else{
                int second = deque.pollLast();
                int first = deque.pollLast();
                switch (token){
                    case "+":
                        deque.addLast(first + second);
                        break;
                    case "-":
                        deque.addLast(first - second);
                        break;
                    case "*":
                        deque.addLast(first * second);
                        break;
                    case "/":
                        deque.addLast(first / second);
                        break;
                }

            }
        }
        return deque.getLast();
    }

    public static void main(String[] args) {
        String[] ex2 = {"4", "13", "5", "/", "+"};
        String[] ex3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(ex2));
        System.out.println(evalRPN(ex3));
    }
}
