package Array;

/*
Q:
https://leetcode.com/problems/implement-strstr/description/

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */

public class L28_ImplementstrStr {

    public int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();

        if (hl < nl) return -1;
        if (nl == 0) return 0;
        for (int i = 0; i+nl <= hl; i++){
            if (haystack.substring(i, i+nl).equals(needle)) return i;
        }
        return -1;
    }

}
