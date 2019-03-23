package TwoPointer;

import java.util.ArrayList;
import java.util.List;
/*
https://leetcode.com/problems/partition-labels/
A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.

Example 1:
Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
Note:

S will have length in range [1, 500].
S will consist of lowercase letters ('a' to 'z') only.

https://leetcode.com/problems/partition-labels/discuss/113259/Java-2-pass-O(n)-time-O(1)-space-extending-end-pointer-solution
 */

public class L763_PartitionLabels {
    public List<Integer> partitionLabels(String S){
        List<Integer> result = new ArrayList<>();
        int[] index = new int[26]; // record last index of each letter
        for (int i = 0; i < S.length(); i++){
            index[S.charAt(i) - 'a'] = i;
        }
        int last = 0, start = 0;
        for (int i = 0; i < S.length(); i++){
            last = Math.max(last, index[S.charAt(i) - 'a']);
            if (last == i){
                result.add(last - start + 1);
                start = last + 1;
            }
        }
        return result;
    }
}
