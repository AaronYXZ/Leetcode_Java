package BitManipulation;

/*
Q:
https://leetcode.com/problems/missing-number/description/

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

 */

public class L268_MissingNumber {

    public int solution(int nums[]){
        int ans = 0;
        for (int i = 0; i<nums.length; i++){
            ans = ans ^ i ^ nums[i];
        }
        return ans ^ nums.length;
    }
}
