package String;

/*
Q:
https://leetcode.com/problems/reverse-string/description/

Write a function that takes a string as input and returns the string reversed.

Example 1:

Input: "hello"
Output: "olleh"
Example 2:

Input: "A man, a plan, a canal: Panama"
Output: "amanaP :lanac a ,nalp a ,nam A"
 */

public class L344_ReverseString {

    public static String reverseString(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length()-1; i>=0; i--){
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

   // Best Solution
    public static String solotuion2_reverseString(String s){
        return new StringBuilder(s).reverse().toString();
        // https://leetcode.com/problems/reverse-string/discuss/80937/JAVA-Simple-and-Clean-with-Explanations-6-Solutions
    }

}
