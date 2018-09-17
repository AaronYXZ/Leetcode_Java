package HashTable;

import java.util.HashMap;
import java.util.Map;

/*
Q:
https://leetcode.com/problems/word-pattern/description/

Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true
Example 2:

Input:pattern = "abba", str = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", str = "dog dog dog dog"
Output: false
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */

public class L290_WordPattern {

    public static boolean wordPattern(String pattern, String str){
        String[] strs = str.split("\\s+");
        if (strs.length != pattern.length()) return false;


        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i<pattern.length(); i++){
            char p = pattern.charAt(i);
            String value = strs[i];
            if (!map.containsKey(p) && map.containsValue(value)) return false;
            if (map.containsKey(p) && !map.get(p).equals(value)) return false;
            map.putIfAbsent(p, value);
        }
        return true;
    }

    public static void main(String[] args) {
        boolean match = wordPattern("abc", "a b c");
        System.out.println(match);
    }
}
