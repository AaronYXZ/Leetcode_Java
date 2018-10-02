package TwoSumSimilar;
/*
Q:
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */

public class L167_TwoSum2_InputArrayIsSorted {

    public int[] twoSum2_Sorted(int[] numbers, int target){
        int lo = 0, hi = numbers.length - 1;
        while (lo < hi){
            if (numbers[lo] + numbers[hi] < target) lo++;
            else if (numbers[lo] +numbers[hi] > target) hi--;
            else return new int[]{lo+1, hi+1};
        }

        return new int[]{0,0};
    }
}
