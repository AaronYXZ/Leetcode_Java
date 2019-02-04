package String;

/*
Q: https://leetcode.com/problems/valid-palindrome-ii/description/
S:
 */

public class L680_ValidPalindromeII {

    public static boolean solution1(String s) {

        if (s == null || s.length() == 0) {
            return true;
        }

        boolean flag = true;

        int front = 0;
        int end = s.length() - 1;

        while (front < end) {
            char frontChar = s.charAt(front++);
            char endChar = s.charAt(end++);
            if (frontChar != endChar) {
                if (flag) {
                    flag = false;
                    if (s.charAt(front + 1) == endChar) {
                        front++;
                    }
                    if (s.charAt(end - 1) == frontChar) {
                        end--;
                    }
                } else {
                    break;
                }
            }

        }
        return front >= end;
    }

    public static boolean vP(String s) {
        int record = 0;
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else if (s.charAt(l + 1) == s.charAt(r)) {
                record++;
                l += 2;
                r--;
            } else if (s.charAt(l) == s.charAt(r - 1)) {
                record++;
                r -= 2;
                l++;
            } else {
                return false;
            }
        }
        return record <= 1;
    }

    public static void main(String[] args) {
        String test = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.println(vP(test));
    }

}
