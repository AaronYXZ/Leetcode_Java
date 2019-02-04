package HashTable;

import java.util.HashMap;
import java.util.Map;

/*
Q:
https://leetcode.com/problems/two-sum/description/
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

public class L1_TwoSums {
    public static int[] TwoSums(int[] nums, int target){
        if (nums == null || nums.length < 0) return new int[]{0,0};
        Map<Integer, Integer> map  = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            if (map.containsKey(nums[i])){
                return new int[]{i, map.get(nums[i])};
            }
            else{
                map.put(target - nums[i], i);
            }
        }
        return new int[]{0,0};

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,6};
        System.out.println(TwoSums(nums, 7)[0]);
        System.out.println(TwoSums(nums, 7)[1]);
    }
}
