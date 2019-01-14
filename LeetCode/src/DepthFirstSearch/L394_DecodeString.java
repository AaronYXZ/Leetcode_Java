package DepthFirstSearch;

import java.util.Stack;

/*
https://leetcode.com/problems/decode-string/description/

Given an encoded string, return it's decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

Examples:

s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".

https://leetcode.com/problems/decode-string/discuss/87534/Simple-Java-Solution-using-Stack
 */

public class L394_DecodeString {

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        String res = "";
        int idx = 0;

        while (idx < s.length()) {
            // repeated numbers are stored in stack here
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = count * 10 + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }
            // res concluded at ']' are pushed to stack here
            else if (s.charAt(idx) == '[') {
                resStack.push(res);
                res = "";
                idx++;

            }
            // res concluded here
            else if (s.charAt(idx) == ']') {
                StringBuilder stringBuilder = new StringBuilder(resStack.pop());
                int repeatTimes = countStack.pop();
                // Since it's always [ letter ], then res gets reset to empty at [, collect all letters between [],
                // and repeat N times here, N is the number right before the [
                // So in summary, the ']' part conclude every "number a + [xyz]" pattern by repeat a times of the letter xyz
                for (int i = 0; i < repeatTimes; i++) {
                    stringBuilder.append(res);
                }
                res = stringBuilder.toString();
                idx++;
            } else {
                res += s.charAt(idx);
                idx++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String test = "2[a3[c]]";
        System.out.println(decodeString(test));
    }
}
