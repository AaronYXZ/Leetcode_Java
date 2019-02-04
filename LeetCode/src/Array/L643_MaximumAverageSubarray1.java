package Array;

/*
https://leetcode.com/problems/maximum-average-subarray-i/description/
Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

Example 1:

Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75


Note:

1 <= k <= n <= 30,000.
Elements of the given array will be in the range [-10,000, 10,000].
 */
public class L643_MaximumAverageSubarray1 {
    public double findMaxAverage(int[] nums, int k){
        int l= nums.length;
        int temp = 0; // keep the sum of k numbers
        for (int i = 0; i < k; i++){
            temp += nums[i];
        }
        double result = (double) temp / k; // keep the final result
        for (int j = 0; j + k < l; j++){ // update temp and result one by one, store the largest result
            temp = temp + nums[j + k] - nums[j];
            result = Math.max(result, (double) temp / k);
        }
        return result;
    }
}
