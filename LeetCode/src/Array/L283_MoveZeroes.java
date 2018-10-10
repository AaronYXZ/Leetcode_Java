package Array;

/*
Q:
https://leetcode.com/problems/move-zeroes/description/

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.

S:
https://leetcode.com/problems/move-zeroes/discuss/72011/Simple-O(N)-Java-Solution-Using-Insert-Index
 */

public class L283_MoveZeroes {
    public void move(int[] nums){
        int zeroes = 0;
        for (int e : nums){
            if (e != 0){
                nums[zeroes] = e;
                zeroes++;
            }
        }
        for (int i = zeroes; i < nums.length; i++){
            nums[i] = 0;
        }

        int[] a = {1,2,3,4,5};
        int[] b = {0,0,0,0,0};



    }

}
