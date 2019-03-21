package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
https://leetcode.com/problems/find-common-characters/

Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

You may return the answer in any order.



Example 1:

Input: ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: ["cool","lock","cook"]
Output: ["c","o"]


Note:

1 <= A.length <= 100
1 <= A[i].length <= 100
A[i][j] is a lowercase letter


 */

public class L1002_FindCommonCharacters {
    public List<String> commonChars(String[] A){
        List<String> result = new ArrayList<>();
        List<Map<String, Integer>> maps = new ArrayList<>();
        for (String a : A){
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < a.length(); i++){
                String tmp = String.valueOf(a.charAt(i));
                map.put(tmp, map.getOrDefault(tmp, 0) + 1);
            }
            maps.add(map);
        }
        Map<String, Integer> firstMap = maps.get(0);
        for (String k : firstMap.keySet()){
            int count = firstMap.get(k);
            if (count == 0) continue;
            for (int i = 1; i < maps.size(); i++){
                Map<String, Integer> tmpMap = maps.get(i);
                count = Math.min(count, tmpMap.getOrDefault(k, 0));
                if (count == 0) break;
            }
            for (int j = 0; j < count; j++){
                result.add(k);
            }
        }
        return result;
    }
}
