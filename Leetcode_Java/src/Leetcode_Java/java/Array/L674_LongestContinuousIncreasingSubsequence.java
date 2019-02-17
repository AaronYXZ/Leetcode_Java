package Array;

/*
https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/

Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

Example 1:
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3.
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4.
Example 2:
Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1.
Note: Length of the array will not exceed 10,000.
 */
public class L674_LongestContinuousIncreasingSubsequence {

    public static int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int l = 0, r = 1;
        int result = 0;
        while (l < nums.length && r < nums.length) {
            if (nums[r-1] < nums[r]) {
                r++;
            } else {
                result = Math.max(result, r - l);
                r += 1;
                l = r - 1;
            }
        }
        return Math.max(result, r - l);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        System.out.println(findLengthOfLCIS(nums));
    }
}
