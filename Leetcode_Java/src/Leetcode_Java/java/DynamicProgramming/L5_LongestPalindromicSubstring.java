package DynamicProgramming;

/*
Q:
https://leetcode.com/problems/longest-palindromic-substring/description/


Given a string s, find the longest palindromic substring in s. You may assume that the maximum
length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"

S:
http://windliang.cc/2018/08/05/leetCode-5-Longest-Palindromic-Substring/
https://leetcode.com/problems/longest-palindromic-substring/discuss/2921/Share-my-Java-solution-using-dynamic-programming
 */

public class L5_LongestPalindromicSubstring {

    public static String solution3DynamicProgramming(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String res = "";

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);

                if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
