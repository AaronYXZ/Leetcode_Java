package Stack;

import java.util.Stack;

public class L844_BackStringCompare {

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '#') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        for (int i = T.length() - 1; i >= 0; i--) {
            char temp = T.charAt(i);

            if (temp == '#') {
                i--;
                continue;
            }
            if (stack.isEmpty()) return false;

            char temp2 = stack.pop();
            if (temp != temp2) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "y#fo##f", t = "y#fx#o##f";

        System.out.println(backspaceCompare(s, t));
    }
}
