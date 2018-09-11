package String;

/*
Q:
https://leetcode.com/problems/ransom-note/description/
S:
https://leetcode.com/problems/ransom-note/discuss/85783/Java-O(n)-Solution-Easy-to-understand

Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
 */

public class L383_RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine){
        int[] arr = new int[26];

        for (int i = 0; i<magazine.length(); i++){
            arr[magazine.charAt(i) - 'a'] ++;
        }

        for (int j = 0; j <ransomNote.length(); j++){
            if (-- arr[ransomNote.charAt(j)-'a'] < 0){
                return false;
            }
        }

        return true;
    }
}
