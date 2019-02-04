package HashTable;


/*
Q:
https://leetcode.com/problems/happy-number/
S:
https://leetcode.com/problems/happy-number/discuss/56917/My-solution-in-C(-O(1)-space-and-no-magic-math-property-involved-)?page=2

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits,
and repeat the process until the number equals 1 (where it will stay),
or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy numbers.

Example:

Input: 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1


https://en.wikipedia.org/wiki/Cycle_detection

 */
public class L202_HappyNumber {
    public static int numSquareSum(int n){
        int numSquareSum = 0;
        while (n > 0){
            numSquareSum += (n %10) * (n % 10);
            n /= 10;
        }

        return numSquareSum;
    }
    public static boolean isHappy(int n){
        int slow = n, fast = n;
        do {
            slow = numSquareSum(slow);
            fast = numSquareSum(fast);
            fast = numSquareSum(fast);
        }
        while (slow != fast);
        if (slow == 1) return true;
        else return false;

    }
}
