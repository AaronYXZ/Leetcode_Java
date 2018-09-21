package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.deploy.util.StringUtils;
/*
Q:
https://leetcode.com/problems/find-all-anagrams-in-a-string/

Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

S:
https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/92007/Sliding-Window-algorithm-template-to-solve-all-the-Leetcode-substring-search-problem.
 */

public class L438_FindAllAnagramsInAString {
    public static List<Integer> solution1_bruteforce(String s, String p) {
        // exceeds time limit
        List<Integer> list = new ArrayList<>();
        int k = p.length();
        for (int i = 0; i+k <=s.length(); i++){
            if (isAnagram(p, s.substring(i, i+k))) list.add(i);
        }

        return list;
    }

    public static boolean isAnagram(String s1, String s2){
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        for (int i = 0; i<a1.length; i++){
            if (a1[i] != a2[i]) return false;
        }

        return true;
    }

    public static List<Integer> solution2_slidingWindow(String s, String p){
//        https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/92007/Sliding-Window-algorithm-template-to-solve-all-the-Leetcode-substring-search-problem.
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) return result;

        // create a hashmap to save the Characters of the target substring
        Map<Character, Integer> map = new HashMap<>();
        for (char c:p.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // maintain a counter to check whether match the target string p
        int counter = map.size();

        // two pointers: begin - left pointer of the window, end - right pointer of the window
        int begin = 0, end = 0;

//        int len = Integer.MAX_VALUE;

        while(end < s.length()){
            char c = s.charAt(end);
            if (map.containsKey(c)){
                map.put(c, map.get(c) -1);
                if (map.get(c) == 0) counter --;
            }
            end ++;

            while (counter == 0){
                char temp = s.charAt(begin);
                if (map.containsKey(temp)){
                    map.put(temp, map.get(temp) + 1);
                    if (map.get(temp) > 0) counter ++;
                }

                begin ++;
            }
        }

        return result;



    }

}
