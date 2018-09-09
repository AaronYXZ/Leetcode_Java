package Math;
/*
Q:
https://leetcode.com/problems/ugly-number/description/
S:
https://leetcode.com/problems/ugly-number/discuss/69214/2-4-lines-every-language

Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

Example 1:

Input: 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: 8
Output: true
Explanation: 8 = 2 × 2 × 2
Example 3:

Input: 14
Output: false
Explanation: 14 is not ugly since it includes another prime factor 7.
Note:

1 is typically treated as an ugly number.
Input is within the 32-bit signed integer range: [−231,  231 − 1].

 */

public class L263_UglyNumber {
    public static boolean uglyNumber(int n){
        for(int i = 2; i< 6 && n > 0; i++){
            while (n % i == 0){
                n /= i;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(uglyNumber(10));
        System.out.println(uglyNumber(14));
    }
}
