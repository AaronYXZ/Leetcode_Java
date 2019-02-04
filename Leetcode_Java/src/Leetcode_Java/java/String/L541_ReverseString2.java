package String;

/*
Q:
https://leetcode.com/problems/reverse-string-ii/description/

Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]

 */

public class L541_ReverseString2 {

    public static String  reverseStr(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        int i;
        for (i = 0; (i+1) * k < s.length(); i++) {
            String temp = s.substring(i * k, (i + 1) * k);
            if (i % 2 == 0) {
                stringBuilder.append(new StringBuilder(temp).reverse());
            } else {
                stringBuilder.append(temp);
            }
        }
        String temp = s.substring(i * k);
        if (i % 2 == 0) {
            stringBuilder.append(new StringBuilder(temp).reverse());
        } else {
            stringBuilder.append(temp);
        }

        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
}
