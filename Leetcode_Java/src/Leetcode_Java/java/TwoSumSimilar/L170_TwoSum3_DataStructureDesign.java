package TwoSumSimilar;

/*
Q:
https://leetcode.com/problems/two-sum-iii-data-structure-design/description/

Design and implement a TwoSum class. It should support the following operations: add and find.

add - Add the number to an internal data structure.
find - Find if there exists any pair of numbers which sum is equal to the value.

Example 1:

add(1); add(3); add(5);
find(4) -> true
find(7) -> false
Example 2:

add(3); add(1); add(2);
find(3) -> true
find(6) -> false
 */

import java.util.HashMap;
import java.util.Map;

public class L170_TwoSum3_DataStructureDesign {

    private Map<Integer, Integer> map = new HashMap<>();

    /**
     * Initialize your data structure here.
     */
    public L170_TwoSum3_DataStructureDesign() {

    }

    /**
     * Add the number to an internal data structure..
     */
    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);

    }

    /**
     * Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int i = entry.getKey();
            int j = value - i;
            if ((i == j && entry.getValue() > 1) || (i != j && map.containsKey(j))){
                return true;
            }
        }
        return false;
    }




}
