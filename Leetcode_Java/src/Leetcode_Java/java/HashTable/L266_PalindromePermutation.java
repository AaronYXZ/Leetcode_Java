package HashTable;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/palindrome-permutation/
Given a string, determine if a permutation of the string could form a palindrome.

Example 1:

Input: "code"
Output: false
Example 2:

Input: "aab"
Output: true
Example 3:

Input: "carerac"
Output: true

 */
public class L266_PalindromePermutation {
    public boolean canPermutePalindrome(String s){
        Map<Character, Integer> maps = new HashMap<>();
        for (char c:s.toCharArray()){
            maps.put(c, maps.getOrDefault(c, 0) + 1);
        }
        boolean flag = false;
        for (int v : maps.values()){
            if (v % 2 != 0){
                if (flag) return false;
                else{
                    flag = true;
                }
            }
        }
        return true;
    }
}
