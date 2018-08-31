package com.company;

import java.util.Arrays;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        final int ASCII_MAX = 255;
        int[] last = new int[ASCII_MAX]; // 记录字符上次出现过的位置
        int start = 0; // 记录当前子串的起始位置

        Arrays.fill(last, -1); // 0也是有效位置，因此初始化为-1
        int max_len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (last[s.charAt(i)] >= start) {
                max_len = Math.max(i - start, max_len);
                start = last[s.charAt(i)] + 1;
            }
            last[s.charAt(i)] = i;
        }
        return Math.max((int)s.length() - start, max_len);  // 别忘了最后一次，例如"abcd"
    }

    public static void main(String[] args){
        Solution3 solution3 = new Solution3();
        int answer = solution3.lengthOfLongestSubstring("abcba");
        System.out.println(answer);
    }
}
