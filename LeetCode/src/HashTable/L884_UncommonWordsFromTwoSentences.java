package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Q:
https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Return a list of all uncommon words.

You may return the list in any order.



Example 1:

Input: A = "this apple is sweet", B = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: A = "apple apple", B = "banana"
Output: ["banana"]


Note:

0 <= A.length <= 200
0 <= B.length <= 200
A and B both contain only spaces and lowercase letters.

S:
https://leetcode.com/problems/uncommon-words-from-two-sentences/discuss/158967/C++JavaPython-Easy-Solution-with-Explanation

 */

public class L884_UncommonWordsFromTwoSentences {
    public static String[] uncommonWords(String A, String B){
        Map<String, Integer> map = new HashMap<>();
        String[] arrayA = (A + " " + B).split("\\s+");
        for (String word:arrayA){
            if (map.containsKey(word)) map.put(word, map.get(word) + 1);
            else map.put(word, 1);
        }

        List<String> lists = new ArrayList<>();
        for (String word:map.keySet()){
            if (map.get(word) == 1) lists.add(word);
        }
//        String[] test = lists.toArray();
        // Doesn't work toArrays converts to Object[], String[] expected
        // https://www.geeksforgeeks.org/arraylist-array-conversion-java-toarray-methods/

        return lists.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] l1 = uncommonWords("I like eating candy", "I like drinking milk");
        for (String w:l1){
            System.out.println(w);
        }
    }
}
