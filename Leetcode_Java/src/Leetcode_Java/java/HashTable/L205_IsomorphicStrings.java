package HashTable;

import java.util.HashMap;
import java.util.Map;

/*
Q:
https://leetcode.com/problems/isomorphic-strings/description/

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.


S:

 */
public class L205_IsomorphicStrings {

    public static boolean solution1(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (map.containsKey(sChar)){
                if (map.get(sChar) != tChar) return false;
            }
            else{
                if(map.containsValue(tChar)) return false;
                else map.put(sChar, tChar);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution1("ab", "aa"));

    }
}
