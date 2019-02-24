package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
https://leetcode.com/problems/subsets/description/
Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

https://leetcode.com/problems/permutations/discuss/18239/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partioning)
 */

public class L78_Subsets {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;

    }

    public static void backtrack(List<List<Integer>> result,  List<Integer> templist, int[] nums, int start){
        result.add(new ArrayList<>(templist));
        for (int i = start; i<nums.length; i++){
            templist.add(nums[i]);
            backtrack(result, templist, nums, i+ 1);
            templist.remove(templist.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        List<List<Integer>> result = new L78_Subsets().subsets(nums);
    }
}
