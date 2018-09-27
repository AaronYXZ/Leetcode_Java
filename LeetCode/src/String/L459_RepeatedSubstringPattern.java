package String;

/*
Q:
https://leetcode.com/problems/repeated-substring-pattern/
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.



Example 1:

Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.
Example 2:

Input: "aba"
Output: False
Example 3:

Input: "abcabcabcabc"
Output: True

S:
https://leetcode.com/problems/repeated-substring-pattern/discuss/94352/Java-Simple-Solution-with-Explanation
 */

public class L459_RepeatedSubstringPattern {

    public static boolean repeatedSubstring(String s){
        int l = s.length();
        for (int i = l/2; i>0; i--){
            if ( l % i == 0){
                int n = l / i;
                String sub = s.substring(0, i);
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j< n; j++){
                    stringBuilder.append(sub);
                }
                if (stringBuilder.toString().equals(s)) return true;
            }

        }

        return false;
    }
}
