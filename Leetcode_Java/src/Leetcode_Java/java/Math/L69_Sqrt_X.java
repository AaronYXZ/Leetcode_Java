package Math;

/*
https://leetcode.com/problems/sqrtx/description/
Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since
             the decimal part is truncated, 2 is returned.
https://leetcode.com/problems/sqrtx/discuss/25047/A-Binary-Search-Solution
 */
public class L69_Sqrt_X {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int l = 1, r = Integer.MAX_VALUE;
        while (true) {
            int mid = l + (l - r) / 2;
            // https://cs.stackexchange.com/questions/80415/why-is-binary-search-using-this-weird-thing-to-calculate-middle
            // left + right may overflow. Which then means you get a result that is less than left. Or far into the negative if you are using signed integers.
            //So instead they take the distance between left and right and add half of that to left. This is only a single extra operation to make the algorithm more robust.
            if (mid > x / mid) {
                r = mid - 1;
            } else {
                if (mid + 1 > x / (mid + 1)) {
                    return mid;
                }
                l = mid + 1;
            }
        }
    }
}
