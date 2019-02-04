package Array;

/*
Q:
https://leetcode.com/problems/product-of-array-except-self/description/

Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

S:
https://leetcode.com/problems/product-of-array-except-self/discuss/65622/Simple-Java-solution-in-O(n)-without-extra-space
 */

public class L238_ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;

        // first loop: multiply all items in front of it
        for (int i = 1; i<n; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        int right = 1;

        // second loop: multiply all item follows it
        for (int i = n-1; i>=0; i--){
            result[i] *= right;
            right *= nums[i];
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 5};
        int[] result = productExceptSelf(nums);
    }
}
