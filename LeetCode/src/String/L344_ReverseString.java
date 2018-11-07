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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L344_ReverseString {

    private static Pattern pattern = Pattern.compile("<([^\\s\\/]*?) [^>]*?extraction-tag[^>]*?>([^<]*?)</[^>]*?>");
    public static Pattern p1 = Pattern.compile("<[^\\s\\/]*? ");
    public static Pattern p2 = Pattern.compile("(\\w{2})([0-9]{3})([a-z]?)");
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

    public static void main(String[] args) {
        String s = "ab123d";
        Matcher matcher = p2.matcher(s);
        System.out.println(matcher.find());
        System.out.println(matcher.group(0));
        System.out.println(matcher.group(1));
        System.out.println(matcher.group(2));

    }
}
