package Array;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
/*
https://leetcode.com/problems/summary-ranges/description/
Given a sorted integer array without duplicates, return the summary of its ranges.

Example 1:

Input:  [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
Example 2:

Input:  [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.
 */

public class L228_SummaryRanges {
    public static List<String> summaryRanges(int[] nums){
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        String start = Integer.toString(nums[0]);
        String end = Integer.toString(nums[0]);
        for (int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] == 1){
                end = Integer.toString(nums[i]);
            }
            else{
                if (start.equals(end)){
                    result.add(start);
                }else{
                    result.add(StringUtils.join(start, "->", end));
                }
//                result.add(StringUtils.join(start, "->", end));
                start =Integer.toString(nums[i]);
                end = Integer.toString(nums[i]);
            }
        }
        if (start.equals(end)){
            result.add(start);
        }else{
            result.add(StringUtils.join(start, "->", end));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }
}
