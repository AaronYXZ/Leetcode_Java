package SlidingWindow;


/*
Q:
https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
S:
https://leetcode.com/articles/longest-substring-without-repeating-characters/

Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", which the length is 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

S:

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class L3_LongestSubstringWithoutRepeatingCharacters {

    public static boolean isUnique(String s, int start, int end){
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++){
            Character character = s.charAt(i);
            if (set.contains(character)) return false;
            set.add(character);
        }
        return true;
    }
    public static int solution1BruteForce(String s){
        int maxLength = 0;
        for (int i = 0; i<s.length(); i++){
            for (int j = i+1; j<s.length()+1; j++){
                if (isUnique(s, i, j)){
                    maxLength = Math.max(maxLength, j-i);
                }
            }
        }
        return maxLength;

    }


    public static int solution2SlidingWindow(String s){
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;

        while(i < n && j < n){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j-i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }

        return ans;
    }

    public static int lengthOfLongestSubstring(String s){

        final int ASCII_MAX = 255;
        int[] last = new int[ASCII_MAX];
        int start = 0;

        Arrays.fill(last, -1); // makes every element of last to be -1
        int max_len = 0;

        for (int i = 0; i<s.length(); i++){
            if (last[s.charAt(i)] > start){
                max_len = Math.max(i - start, max_len);
                start = last[s.charAt(i)]+1;

            }

            last[s.charAt(i)] = i;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdef"));
        int[] test = new int[10];
        System.out.println(test['a']);
        Arrays.fill(test, -1);
        System.out.println("test");

    }


}
