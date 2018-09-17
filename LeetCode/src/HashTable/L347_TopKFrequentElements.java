package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Q:
https://leetcode.com/problems/top-k-frequent-elements/description/
Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
Note:

You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.


S:
https://leetcode.com/problems/top-k-frequent-elements/discuss/81602/Java-O(n)-Solution-Bucket-Sort
 */
public class L347_TopKFrequentElements {

    public static List<Integer> topKFrequentElements(int[] nums, int k){
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n:nums){
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        for (int key: frequencyMap.keySet()){
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> res = new ArrayList<>();

        for (int pos = bucket.length-1; pos >=0 && res.size() < k; pos--){
            if (bucket[pos] != null){
                res.addAll(bucket[pos]);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1,1,1, 4,4,4, 3, 2,2};
        List<Integer> list = topKFrequentElements(nums, 2);
        for (int n:list){
            System.out.println(n);
        }
        System.out.println("a");
    }

}
