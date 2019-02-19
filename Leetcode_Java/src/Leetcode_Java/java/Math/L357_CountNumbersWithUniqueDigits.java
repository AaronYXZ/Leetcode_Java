package Math;
/*
https://leetcode.com/problems/count-numbers-with-unique-digits/description/
Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.

Example:

Input: 2
Output: 91
Explanation: The answer should be the total numbers in the range of 0 ≤ x < 100,
             excluding 11,22,33,44,55,66,77,88,99
 */

public class L357_CountNumbersWithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        // n =1 , return 10
        // n = 2, return 9 * 9
        // n = 3, return 9 * 9 * 8, also n2*8
        // n = 4, return n3 * 7
        // n = 10, return n9 * 1
        int result = 10;
        if (n == 0) return 1;
        int pre = 9;
        for (int i = 1; i < Math.min(n, 10); i++){
            pre = pre * (10 - i);
            result +=  pre;
        }
        return result;
    }
}
