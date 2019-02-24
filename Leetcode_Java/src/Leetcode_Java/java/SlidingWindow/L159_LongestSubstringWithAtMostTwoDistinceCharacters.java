package SlidingWindow;

import java.util.HashMap;
import java.util.Map;
/*
https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/description/
Given a string s , find the length of the longest substring t  that contains at most 2 distinct characters.

Example 1:

Input: "eceba"
Output: 3
Explanation: t is "ece" which its length is 3.
Example 2:

Input: "ccaabbb"
Output: 5
Explanation: t is "aabbb" which its length is 5.

https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/92007/Sliding-Window-algorithm-template-to-solve-all-the-Leetcode-substring-search-problem.
 */

public class L159_LongestSubstringWithAtMostTwoDistinceCharacters {

    public static int LengthOfLongestSubstringTwoDistince(String s) {
        int begin = 0, end = 0;
        int len = 0;
        int counter = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            char tmp = s.charAt(end);
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
            if (map.get(tmp) == 1) {
                counter++;
            }
            end++;

            while (counter > 2) {
                char tmpc = s.charAt(begin);
                map.put(tmpc, map.get(tmpc) - 1);
                begin++;
                if (map.get(tmpc) == 0) {
                    counter--;
                }
            }
            len = Math.max(len, end - begin);
        }
        return len;
    }

    public static void main(String[] args) {
        String test1 = "ccaabbb";
        System.out.println(LengthOfLongestSubstringTwoDistince(test1));
    }
}
