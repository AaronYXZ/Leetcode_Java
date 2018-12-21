package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class L78_Subsets {
    public List<List<Integer>> subset(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;

    }

    public static void backtrack(List<List<Integer>> list,  List<Integer> templist, int[] nums, int start){
        list.add(new ArrayList<>(templist));
        for (int i = start; i<nums.length; i++){
            templist.add(nums[i]);
            backtrack(list, templist, nums, i+ 1);
            templist.remove(templist.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        List<List<Integer>> result = new L78_Subsets().subset(nums);
    }
}
