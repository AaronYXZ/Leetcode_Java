package BitManipulation;

// Bitwise XOR
/*
Q:
https://leetcode.com/problems/single-number/description/
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4

S:
https://leetcode.com/problems/single-number/discuss/43201/Easy-Java-solution-(tell-you-why-using-bitwise-XOR)
 */
public class L136_SingleNumber {

    public static int singleNumber(int[] nums){
        int ans = 0;
        for (int i = 0; i < nums.length; i++){
            ans ^= nums[i];

        }

        return ans;

    }
}
