package HashTable;


/*
Q:
https://leetcode.com/problems/happy-number/
S:
https://leetcode.com/problems/happy-number/discuss/56917/My-solution-in-C(-O(1)-space-and-no-magic-math-property-involved-)?page=2

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
