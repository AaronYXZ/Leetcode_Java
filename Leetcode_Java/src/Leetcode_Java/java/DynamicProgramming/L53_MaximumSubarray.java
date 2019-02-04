package DynamicProgramming;
/*
https://leetcode.com/problems/maximum-subarray/description/

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.



S:
https://leetcode.com/problems/maximum-subarray/discuss/20211/Accepted-O(n)-solution-in-java
 */

public class L53_MaximumSubarray {
    public static int maxSubArray(int[] nums){
        int maxSoFar = nums[0], maxEndingHere = nums[0];

        for (int i = 1; i<nums.length; i++){
            maxEndingHere = Math.max(maxEndingHere+nums[i], nums[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }

        return maxSoFar;
    }
}
