package HashTable;

import java.util.HashMap;
import java.util.Map;

/*
Q:
https://leetcode.com/problems/subarray-sum-equals-k/description/

Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:
Input:nums = [1,1,1], k = 2
Output: 2
Note:
The length of the array is in range [1, 20,000].
The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].


S:
https://leetcode.com/problems/subarray-sum-equals-k/discuss/102106/Java-Solution-PreSum-+-HashMap
 */

public class L560_SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k ){
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);

        for (int i = 0; i< nums.length; i++){
            sum+=nums[i]; // sum of nums[0, i]
            if (preSum.containsKey(sum - k)){
                // check if any previously stored sum of nums[0, j] statisfy nums[0, i] - nums[0, j] == k
                // which equals nums[j+1, i] == k
                result+=preSum.get(sum-k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
            // store the sum of nums[0, i] into the preSum map

        }

        return result;
    }
}
