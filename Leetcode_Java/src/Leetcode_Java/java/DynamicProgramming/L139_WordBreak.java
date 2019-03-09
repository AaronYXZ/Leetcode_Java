package DynamicProgramming;

import java.util.List;
/*
https://leetcode.com/problems/word-break/
Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

Note:

The same word in the dictionary may be reused multiple times in the segmentation.
You may assume the dictionary does not contain duplicate words.
Example 1:

Input: s = "leetcode", wordDict = ["leet", "code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:

Input: s = "applepenapple", wordDict = ["apple", "pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
             Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
Output: false

https://leetcode.com/problems/word-break/discuss/43790/Java-implementation-using-DP-in-two-ways
 */
public class L139_WordBreak {
    public boolean wordBreak(String s, List<String> wordDict){
        // s is wordBreak can be break into two parts: s.substring(0, j) is wordBreak
        // and s.subSstring(j, end) contained by wordDict

        // starting from i = 1, check whether any substring (0, i) to (i-1, i) is wordBreak, if yes then set f[i] to true.
        // In the end, check if f[end] is true, which means s is wordBreak. Note s.substring(0, end) equal s

        boolean f[] = new boolean[s.length() + 1];
        f[0] = true;

        for (int i = 1; i <= s.length(); i++){
            for (int j = 0; j < i; j++){
                if (f[j] && wordDict.contains(s.substring(j, i))){
                    // f[j] is true indicates s.substring(0, j) is a wordBreak of dict,
                    // we only need to check if s.substring(j, i) is a wordBreak also
                    f[i] = true;
                    break;
                }
            }
        }
        return f[s.length()];
    }
}
