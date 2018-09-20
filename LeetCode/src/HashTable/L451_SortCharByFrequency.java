package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Q:
https://leetcode.com/problems/sort-characters-by-frequency/
Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

S:
https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/92007/Sliding-Window-algorithm-template-to-solve-all-the-Leetcode-substring-search-problem.
 */

public class L451_SortCharByFrequency {
    public static String frequencySort(String s){

        Map<Character, Integer> map = new HashMap<>();
        for (char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        List<Character>[] bucket = new List[s.length() + 1];
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            char c = entry.getKey();
            int freq = entry.getValue();
            if (bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int pos = bucket.length-1; pos >=0; pos--){
            if (bucket[pos] != null){
                for (char c:bucket[pos]){
                    for (int i = 0; i<map.get(c); i++){
                        stringBuilder.append(c);
                    }
                }
            }
        }
        return stringBuilder.toString();
    }
}
