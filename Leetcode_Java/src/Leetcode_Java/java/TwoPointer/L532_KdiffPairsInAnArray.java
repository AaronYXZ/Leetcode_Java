package TwoPointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
https://leetcode.com/problems/k-diff-pairs-in-an-array/
Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Example 1:
Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
Example 2:
Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
Example 3:
Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).
Note:
The pairs (i, j) and (j, i) count as the same pair.
The length of the array won't exceed 10,000.
All the integers in the given input belong to the range: [-1e7, 1e7].

https://leetcode.com/problems/k-diff-pairs-in-an-array/discuss/100104/Two-pointer-Approach
 */

public class L532_KdiffPairsInAnArray {

    public int findPairs_HashMap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            // 2 possibilities:
            // 1) k == 0, pick all num that has more than 1 appearances
            // 2) k > 0, check if there's num + k in the map
            if (k == 0 && map.get(num) > 1 || k > 0 && map.containsKey(k + num)) {
                result++;
            }
        }
        return result;
    }

    public int findParis_TwoPointer(int[] nums, int k) {
        int l = nums.length;
        int result = 0, start = 0, end = 0;
        Arrays.sort(nums);
        while (start < l && end < l) {
            if (start == end || nums[start] + k > nums[end]) {
                end++;
            } else if (nums[start] + k < nums[end]) {
                start++;
            } else{
                result++;
                start++;
                while(end < l -1 && nums[end] == nums[end+1]){
                    end++;
                }
                end++;
            }
        }
        return result;
    }
}
