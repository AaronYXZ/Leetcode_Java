package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Q:
https://leetcode.com/problems/keyboard-row/description/
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.


Example:

Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]


Note:

You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.

S:
https://leetcode.com/problems/keyboard-row/discuss/97870/Short-Easy-Java-with-Explanation
 */

public class L500_KeyboardRow {

    public String[] findWords(String[] words) {
        String[] strs = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            for (char c : temp) {
                map.put(c, i);
            }
        }

        List<String> results = new ArrayList<>();
        for (String word : words) {
            if (word == "") {
                continue;
            }
            int index = map.get(word.toUpperCase().charAt(0));
            for (char c : word.toUpperCase().toCharArray()) {
                if (map.get(c) != index) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                results.add(word);
            }
        }
        return results.toArray(new String[0]);


    }
}
