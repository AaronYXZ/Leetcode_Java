package String;

/*
Q:https://leetcode.com/problems/first-unique-character-in-a-string/description/
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
 */
public class L387_FirstUniqueCharacterInAString {

    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++){
            if (freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcod"));
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
