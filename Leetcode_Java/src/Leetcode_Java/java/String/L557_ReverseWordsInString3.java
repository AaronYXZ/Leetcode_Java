package String;
/*
https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string
 */

// StringBuilder(string).reverse().toString()
// String.join(" ", String[] strs)

public class L557_ReverseWordsInString3 {
    public String reverseWords(String s){
        String[] strings = s.split(" ");
        String[] results = new String[strings.length];
        for (int i = 0; i<strings.length; i++){
            results[i] = new StringBuilder(strings[i]).reverse().toString();
        }
        return String.join(" ", results);
    }
}
