package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
https://leetcode.com/problems/minimum-index-sum-of-two-lists/solution/
Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

Example 1:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".
Example 2:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["KFC", "Shogun", "Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
Note:
The length of both lists will be in the range of [1, 1000].
The length of strings in both lists will be in the range of [1, 30].
The index is starting from 0 to the list length minus 1.
No duplicates in both lists.
 */

public class L599_MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2){
        Map<String, Integer> map1 = new HashMap<>();
        List<String> results = new ArrayList<>();
        String result;
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++){
            map1.put(list1[i], i);
        }
        for (int j = 0; j < list2.length; j++){
            String tmp = list2[j];
            if (map1.containsKey(tmp)){
                int curSum = j + map1.get(tmp);
                if (curSum  == sum){
                    results.add(tmp);
                    sum = curSum;
                }
                else if (curSum < sum){
                    results.clear();
                    results.add(tmp);
                    sum = curSum;
                }
            }
        }
        return results.toArray(new String[results.size()]);
    }
}
