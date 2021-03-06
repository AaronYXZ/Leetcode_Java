package Math;

import java.util.Arrays;
/*
https://leetcode.com/problems/maximum-product-of-three-numbers/description/
Given an integer array, find three numbers whose product is maximum and output the maximum product.

Example 1:

Input: [1,2,3]
Output: 6


Example 2:

Input: [1,2,3,4]
Output: 24


Note:

The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.

 */

public class L628_MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums){
        Arrays.sort(nums);
        int l = nums.length;
        // all elements are negative, pick 3 with samllest absolute value (i.e. the last 3 elements)
        if (nums[l-1] < 0) return (nums[l-1] * nums[l-2]* nums[l-3]);
        else { // at least one is positive
            int left = nums[0] * nums[1], right = nums[l-2] * nums[l-3];
            // compare the first 2 and last 2 (except the largest one)
            if ( left >= right){
                return left * nums[l-1];
            }
            else {
                return right * nums[l-1];
            }
        }
    }

    public int maximumProductOn(int[] nums){
        // https://leetcode.com/problems/maximum-product-of-three-numbers/discuss/104729/Java-O(1)-space-O(n)-time-solution-beat-100
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return Math.max(max1*max2*max3, max1*min1*min2);
    }
}
