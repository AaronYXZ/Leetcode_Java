package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Q:
https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

S:
ToDo Solve FollowUp questions

 */

public class L350_IntersectionOfTwoArrays2 {

    // Use a map to store number and its freq in nums1, iterate through nums2 and check if it appears in map;
    // Use a List to store the found number, then create array and copy number in List to the array

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num1 : nums1) {
            map.put(num1, map.getOrDefault(num1, 0) + 1);
        }

        for (int num2 : nums2) {
            if (map.containsKey(num2) && map.get(num2) > 0){
                list.add(num2);
                map.put(num2, map.get(num2) -1);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;

    }

}
