package String;

/*
Q:
https://leetcode.com/problems/longest-palindromic-substring/description/
S:
http://windliang.cc/2018/08/05/leetCode-5-Longest-Palindromic-Substring/

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */

public class L5_LongestPalindromicSubstring {

    public static String solution3DynamicProgramming(String s) {
        int length = s.length();
        boolean[][] P = new boolean[length][length];
        int maxLen = 0;
        String maxPal = "";

        for (int i = 1; i <= length; i++) {
            for (int start = 0; start < length; start++) {
                int end = start + i - 1;
                if (end >= length) {
                    break;
                }
                P[start][end] = (i == 1 || i == 2 || P[start + 1][end - 1]) && s.charAt(start) == s.charAt(end);
                if (P[start][end] && i > maxLen) {
                    maxPal = s.substring(start, end + 1);
                }
            }
        }
        return maxPal;
    }
}
