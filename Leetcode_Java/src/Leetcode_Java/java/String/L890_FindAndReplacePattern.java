package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
https://leetcode.com/problems/find-and-replace-pattern/description/

You have a list of words and a pattern, and you want to know which words in words matches the pattern.

A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.

(Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.)

Return a list of the words in words that match the given pattern.

You may return the answer in any order.



Example 1:

Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
since a and b map to the same letter.


Note:

1 <= words.length <= 50
1 <= pattern.length = words[i].length <= 20

 */

public class L890_FindAndReplacePattern {

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        int pl = pattern.length();
        for (String word : words) {
            if (word.length() != pl) {
                continue;
            }
            Map<Character, Character> map = new HashMap<>();
            boolean flag = true;
            for (int i = 0; i < pl; i++) {
                char p = pattern.charAt(i);
                char w = word.charAt(i);
                // check if the char from p already exists
                if (!map.containsKey(p)) { // p doesn't exist, then check if value from word already exists
                    if (map.containsValue(w)) {
                        flag = false;
                        continue;
                    } else {
                        map.put(p, w);
                    }
                } else if (map.get(p) != w) { // p already exist, get the value from map and compare from char from word
                    flag = false;
                    continue;
                }
            }
            if (flag) {
                result.add(word);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = new String[] {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        List<String> result;
        result = findAndReplacePattern(words, pattern);
        System.out.println(result);

    }
}

