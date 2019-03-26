package String;

/*
https://leetcode.com/problems/detect-capital/
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
Example 1:
Input: "USA"
Output: True
Example 2:
Input: "FlaG"
Output: False
Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */

public class L520_DetectCapital {

    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }
        // if first char is Capital,
        if (Character.isUpperCase(word.charAt(0))) {
            // get 2nd char's flag true - capital, false - non capital
            boolean flag = Character.isUpperCase(word.charAt(1));
            for (int i = 2; i < word.length(); i++) {
                // loop through the rest chars, return flase if
                // 1) flag is true, rest if false, 2) flag is false, rest is true
                if ((flag && !Character.isUpperCase(word.charAt(i))) || (!flag && Character.isUpperCase(word.charAt(i)))) {
                    return false;
                }
            }
        }
        // if first char isn't capital
        else {
            // loop through every char, return flase is any is capital
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;

    }
}
