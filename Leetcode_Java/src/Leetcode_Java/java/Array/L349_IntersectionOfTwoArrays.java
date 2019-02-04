package Array;

import java.util.HashSet;
import java.util.Set;
/*
Q:
https://leetcode.com/problems/intersection-of-two-arrays/description/

Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.


S:
无聊的iteration 下次没必要再看

 */

public class L349_IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> setNums1 = new HashSet<>();
        for (int num1:nums1){
            if (!setNums1.contains(num1)) setNums1.add(num1);
        }
        for (int num2:nums2){
            if (setNums1.contains(num2)) set.add(num2);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int number:set){
            result[i++] = number;
        }
        return result;

    }
}
