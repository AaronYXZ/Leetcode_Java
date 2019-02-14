package Array;
/*
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

Find the minimum element.

You may assume no duplicate exists in the array.

Example 1:

Input: [3,4,5,1,2]
Output: 1
Example 2:

Input: [4,5,6,7,0,1,2]
Output: 0
 */

public class L153_FindMinimumInRotatedSortedArray {
    // the easiest solution is to loop thru the whole array, find the first decending item and return. Complexity is O(N)
    // ToDo Binary Search
    public int findMin(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < result){
                return nums[i];
            }
        }
        return result;
    }
}
