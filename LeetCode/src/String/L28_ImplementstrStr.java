package String;


/*
Q:
https://leetcode.com/problems/implement-strstr/description/
S:
https://blog.csdn.net/linhuanmars/article/details/20276833
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

For the purpose of this problem, we will return 0 when needle is an empty string.
 */
public class L28_ImplementstrStr {
    public static int strStr(String haystack, String needle){
        if (haystack == null || needle == null || needle.length() == 0) return 0;

        int hLen = haystack.length();
        int nLen = needle.length();
        if (nLen > hLen) return  -1;

        for (int i = 0; i <= hLen - nLen; i++ ){
            boolean matched = true;
            for ( int j = 0; j < nLen; j++){
                if(needle.charAt(j) != haystack.charAt(i+j)){
                    matched = false;
                    break;
                }
            }
            if (matched) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }
}
