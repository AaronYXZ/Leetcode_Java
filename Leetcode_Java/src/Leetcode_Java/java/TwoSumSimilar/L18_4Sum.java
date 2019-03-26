package TwoSumSimilar;
/*
https://leetcode.com/problems/4sum/
Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:

The solution set must not contain duplicate quadruplets.

Example:

Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]

https://leetcode.com/problems/4sum/discuss/8547/7ms-java-code-win-over-100
Basic idea is using subfunctions for 3sum and 2sum, and keeping throwing all impossible cases.
O(n^3) time complexity, O(1) extra space complexity.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ToDo
public class L18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if (nums == null || len < 4) return result;

        Arrays.sort(nums);

        int max = nums[len-1];
        if (4 * nums[0] > target || 4 * max < target) return result;

        return result;
    }

}
