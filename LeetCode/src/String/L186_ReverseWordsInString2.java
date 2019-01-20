package String;
/*
https://leetcode.com/problems/reverse-words-in-a-string-ii/description/
Given an input string , reverse the string word by word.

Example:

Input:  ["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]
Output: ["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]
Note:

A word is defined as a sequence of non-space characters.
The input string does not contain leading or trailing spaces.
The words are always separated by a single space.
Follow up: Could you do it in-place without allocating extra space?
 */

public class L186_ReverseWordsInString2 {
    public void reverseWords(char[] str){
        reverseArray(str, 0, str.length-1);
        int keeper = 0;
        for (int i =0; i < str.length; i++){
            if (str[i] == ' '){
                reverseArray(str, keeper, i-1);
                keeper = i+1;
            }
        }
        reverseArray(str, keeper, str.length-1);
    }
    public void reverseArray(char[] str, int s, int e){
        while (s < e){
            char temp = str[e];
            str[e] = str[s];
            str[s] = temp;
            s++;
            e--;
        }
    }
}
