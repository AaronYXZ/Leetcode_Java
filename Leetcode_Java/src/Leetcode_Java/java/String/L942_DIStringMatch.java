package String;
/*
https://leetcode.com/problems/di-string-match/description/
Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.

Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:

If S[i] == "I", then A[i] < A[i+1]
If S[i] == "D", then A[i] > A[i+1]


Example 1:

Input: "IDID"
Output: [0,4,1,3,2]
Example 2:

Input: "III"
Output: [0,1,2,3]
Example 3:

Input: "DDI"
Output: [3,2,0,1]


Note:

1 <= S.length <= 10000
S only contains characters "I" or "D".

https://leetcode.com/problems/di-string-match/discuss/194904/C++JavaPython-Straight-Forward
 */

public class L942_DIStringMatch {
    public int[] diStringMatch(String S){
        int n = S.length();
        int l = 0, r = n;
        int[] result = new int[n+1];
        for (int i = 0; i < n; i++){
            result[i] = S.charAt(i) == 'I' ? l++ : r--;
        }
        result[n] = l;
        return result;
    }
}
