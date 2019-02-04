package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Q:
https://leetcode.com/problems/degree-of-an-array/description/

Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

Example 1:
Input: [1, 2, 2, 3, 1]
Output: 2
Explanation:
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.
Example 2:
Input: [1,2,2,3,1,4,2]
Output: 6
Note:

nums.length will be between 1 and 50,000.
nums[i] will be an integer between 0 and 49,999.


S:

 */

public class L697_DegreeOfAnArray {

    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            if (mapEntry.getValue() > maxFreq) {
                maxFreq = mapEntry.getValue();
            }
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            if (mapEntry.getValue() == maxFreq) {
                list.add(mapEntry.getKey());
            }
        }

        Map<Integer, List<Integer>> resultMap = new HashMap<>();
        for (int key : list) {
            resultMap.put(key, new ArrayList<Integer>());
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                resultMap.get(nums[i]).add(i);
            }
        }

        int result = Integer.MAX_VALUE;
        for (List<Integer> list1:resultMap.values()){
            int temp = list1.get(list1.size()-1) - list1.get(0) + 1;
            result = Math.min(result, temp);
        }

        return result;

    }

    public static void main(String[] args) {
        int[] test1 = {1,3, 2, 2, 3, 1};
        int result = findShortestSubArray(test1);
        System.out.println(result);
        System.out.println("test");
    }

}
