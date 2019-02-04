package String;

import java.util.Arrays;
import java.util.Collections;

/*
Q:
https://leetcode.com/problems/reverse-words-in-a-string/description/
S:
https://leetcode.com/problems/reverse-words-in-a-string/discuss/47781/Java-3-line-builtin-solution

Given an input string, reverse the string word by word.

Example:

Input: "the sky is blue",
Output: "blue is sky the".
Note:

A word is defined as a sequence of non-space characters.
Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
You need to reduce multiple spaces between two words to a single space in the reversed string.
 */

public class L151_ReverseWordsInString {
    public static String solution1_own(String s){
        String[] strings = s.trim().split(" +");
        String[] results = new String[strings.length];
        for (int i = 0; i<strings.length; i++){
            results[i] = new StringBuilder(strings[i]).reverse().toString().trim();
        }
        String result = String.join(" ", results);
        return new StringBuilder(result).reverse().toString();
    }

    public static String solution2(String s){
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String a = "a   b";
        String[] test = a.trim().split(" +");
        System.out.println(test[1]);
        System.out.println(test[1].length());
    }
}
