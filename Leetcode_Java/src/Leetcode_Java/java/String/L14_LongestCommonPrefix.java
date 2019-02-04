package String;

/*
Q:
https://leetcode.com/problems/longest-common-prefix/description/
S:
https://leetcode.com/problems/longest-common-prefix/solution/

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
 */

public class L14_LongestCommonPrefix {

    public static String solution2_VerticalSearch(String[] strs){
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++){
                if (i == strs[j].length() || c != strs[j].charAt(i)){
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(solution2_VerticalSearch(strs));


    }
}
