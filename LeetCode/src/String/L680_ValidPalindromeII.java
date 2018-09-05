package String;

/*
Q: https://leetcode.com/problems/valid-palindrome-ii/description/
S:
 */

public class L680_ValidPalindromeII {
    public static boolean solution1(String s){

        if (s == null || s.length() == 0){
            return true;
        }

        boolean flag = true;

        int front = 0;
        int end = s.length() - 1;

        while (front < end){
            char frontChar = s.charAt(front++);
            char endChar = s.charAt(end++);
            if (frontChar != endChar) {
                if (flag) {
                    flag = false;
                    if (s.charAt(front + 1) == endChar)
                        front++;
                    if (s.charAt(end - 1) == frontChar)
                        end--;
                }
                else break;
            }

        }
        return front >= end;
    }
}
