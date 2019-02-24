package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
https://leetcode.com/problems/subsets-ii/description/
Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: [1,2,2]
Output:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
https://leetcode.com/problems/permutations/discuss/18239/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partioning)
 */

public class L90_Subsets2 {
    public List<List<Integer>> subsetWithDup(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> tmp, int[] nums, int start){
        result.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; i++){
            if (i > start && nums[i] == nums[i+1]) continue; // skip duplicates
            tmp.add(nums[i]);
            backtrack(result, tmp, nums, i+1);
            tmp.remove(tmp.size() -1 );
        }
    }
}
