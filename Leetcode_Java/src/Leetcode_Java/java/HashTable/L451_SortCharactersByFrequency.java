package HashTable;
/*
https://leetcode.com/problems/sort-characters-by-frequency/description/
Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input:
"cccaaa"

Output:
"cccaaa"

Explanation:
Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input:
"Aabb"

Output:
"bbAa"

Explanation:
"bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.

https://leetcode.com/problems/sort-characters-by-frequency/discuss/93420/Java-O(n)-Bucket-Sort-Solution-O(nlogm)-PriorityQueue-Solution-easy-to-understand
 */

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class L451_SortCharactersByFrequency {
 public String frequencySort(String s){
     Map<Character, Integer> map = new HashMap<>();
     for (char c:s.toCharArray()){
         map.put(c, map.getOrDefault(c, 0) + 1);
     }

     PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
     pq.addAll(map.entrySet());

     StringBuilder stringBuilder = new StringBuilder();
     while (!pq.isEmpty()){
         Map.Entry entry = pq.poll();
         for (int i = 0; i < (int) entry.getValue(); i++){
             stringBuilder.append(entry.getKey());
         }
     }
     return stringBuilder.toString();
 }
}
