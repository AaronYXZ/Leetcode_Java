package String;

import java.util.LinkedList;
import java.util.List;

/*
Q:
https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.



Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

S：
https://segmentfault.com/a/1190000003766442

ToDo Depth First Search  1) Algorithms Chap 4 Graph Start from P531 2) Leetcode Tag: https://leetcode.com/tag/depth-first-search/
 */

public class L17_LetterCombinationOfAPhoneNumber {

    List<String> res;

    public List<String> letterCombinations(String digits) {
        // 建立映射表
        String[] table = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder stringBuilder = new StringBuilder();
        res = new LinkedList<String>();
        helper(table, 0, stringBuilder, digits);
        return res;
    }

    private void helper(String[] table, int idx, StringBuilder stringBuilder, String digits){
        if(idx == digits.length()){
            // inx equals input digits's length means we already found a solution, add that to the list
            if(stringBuilder.length()!=0) res.add(stringBuilder.toString());
        } else {
            // 找出当前位数字对应可能的字母
            String candidates = table[digits.charAt(idx) - '0'];
            // 对每个可能字母进行搜索
            for(int i = 0; i < candidates.length(); i++){
                stringBuilder.append(candidates.charAt(i));
                helper(table, idx+1, stringBuilder, digits);
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }
        }
    }
}
