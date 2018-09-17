package Array;

import java.util.Arrays;
/*
Q:
https://leetcode.com/problems/valid-anagram/description/

Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */

public class L242_ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s == null || t == null) return false;

        if (s.length() != t.length()) return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        for (int i = 0; i != s.length(); i++){
            if (sChars[i] != tChars[i]) return false;
        }
        return true;
    }
}
