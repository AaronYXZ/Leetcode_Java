package TwoPointer;

/*

Q:
https://leetcode.com/problems/reverse-vowels-of-a-string/description/

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"
Example 2:

Input: "leetcode"
Output: "leotcede"
Note:
The vowels does not include the letter "y".


S:
https://leetcode.com/problems/reverse-vowels-of-a-string/discuss/81225/Java-Standard-Two-Pointer-Solution
 */

public class L345_ReverseVowelsofString {

    public String reverseVowels(String s){
        if (s == null || s.length() == 0){
            return s;
        }
        char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;

        while (start < end){
            while (start < end && !vowels.contains(chars[start] + "")){
                start++;
            }
            while (start < end && !vowels.contains(chars[end] + "")){
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);
    }
}
