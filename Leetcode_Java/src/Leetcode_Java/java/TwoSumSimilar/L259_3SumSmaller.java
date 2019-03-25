package TwoSumSimilar;

import java.util.Arrays;
/*
https://leetcode.com/problems/3sum-smaller/
Given an array of n integers nums and a target, find the number of index triplets i, j, k with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.

Example:

Input: nums = [-2,0,1,3], and target = 2
Output: 2
Explanation: Because there are two triplets which sums are less than 2:
             [-2,0,1]
             [-2,0,3]
Follow up: Could you solve it in O(n2) runtime?
 */

public class L259_3SumSmaller {
    public int threeSumSmaller(int[] nums, int target){
        // use two loops, outer loop iterates over first index, inner loop iterates over 2nd and 3rd
        int result = 0;
        Arrays.sort(nums);
        int l = nums.length;
        // 1st loop
        for (int i = 0; i < l - 2; i++){
            int start = i + 1, end = l - 1;
            // 2nd loop
            while (start < end){
                if (nums[i] + nums[start] + nums[end] < target){
                    // if start + end < target, then any combi of start and (<end) < target, so result + (end - start)
                    result+= end - start;
                    start++;
                } else{
                    //if start + end >= target, end--
                    end--;
                }
            }
        }
        return result;
    }
}
