package HashTable;

import java.util.HashSet;
import java.util.Set;

/*

https://leetcode.com/problems/contains-duplicate/description/
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
public class L217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a:nums){
            if (set.contains(a)) return true;
            set.add(a);
        }
        return false;

    }
}
