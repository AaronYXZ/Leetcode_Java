package String;

/*
https://leetcode.com/problems/multiply-strings/description/
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
Note:

The length of both num1 and num2 is < 110.
Both num1 and num2 contain only digits 0-9.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.
You must not use any built-in BigInteger library or convert the inputs to integer directly.


https://leetcode.com/problems/multiply-strings/discuss/17605/Easiest-JAVA-Solution-with-Graph-Explanation
 */
public class L43_MultiplyStrings {

    public static String multiply(String num1, String num2) {
        int total = 0;
        int n1 = num1.length(), n2 = num2.length();
        int[] digits = new int[n1 + n2];
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int d1 = num1.charAt(i) - '0';
                int d2 = num2.charAt(j) - '0';
                int m = d1 * d2;
                int sum = digits[i + j + 1] + m;
                digits[i + j] += sum / 10;
                digits[i + j + 1] = sum % 10;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int d:digits){
            if (!(stringBuilder.length() == 0 && d==0)) {
                stringBuilder.append(d);
            }
        }

        return stringBuilder.length() == 0? "0":stringBuilder.toString();

    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println(multiply(num1, num2));
    }
}
