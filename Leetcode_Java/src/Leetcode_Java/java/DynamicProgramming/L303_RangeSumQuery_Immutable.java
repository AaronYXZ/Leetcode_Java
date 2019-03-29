package DynamicProgramming;

/*
https://leetcode.com/problems/range-sum-query-immutable/
Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
You may assume that the array does not change.
There are many calls to sumRange function.

 */
public class L303_RangeSumQuery_Immutable {
    int[] nums;

    public L303_RangeSumQuery_Immutable(int[] nums) {
        for (int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        return nums[j] - (i == 0 ? 0 : nums[i-1]);
    }
}
