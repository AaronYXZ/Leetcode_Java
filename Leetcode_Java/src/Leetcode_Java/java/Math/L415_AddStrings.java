package Math;
/*
https://leetcode.com/problems/add-strings/description/
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */

public class L415_AddStrings {
    public static String addStrings(String num1, String num2){
        int tmp = 0;
        int l1 = num1.length(), l2 = num2.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < Math.max(l1, l2); i++){
            int numAt1 = i < l1 ? num1.charAt(l1 - 1 - i) - '0' : 0;
            int numAt2 = i < l2 ? num2.charAt(l2 - 1 - i) - '0' : 0;
            int cur = (numAt1 + numAt2 + tmp) % 10;
            tmp = (numAt1 + numAt2 + tmp) / 10;
            stringBuilder.append(cur);
        }
        if (tmp > 0){
            stringBuilder.append(tmp);
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "986";
        System.out.println(addStrings(num1, num2));
    }
}
