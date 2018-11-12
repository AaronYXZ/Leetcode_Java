package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Q:
https://leetcode.com/problems/group-anagrams/description/
S:
https://leetcode.com/problems/group-anagrams/solution/
 */

public class L49_GroupAnagrams {

    public static List<List<String>> solution1(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String string : strs) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            //            String key = chars.toString();
            String key = String.valueOf(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(string);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String string = "helloWorld";
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        String key1 = String.valueOf(chars);
        String key2 = chars.toString();
        String key3 = Arrays.toString(chars);
        System.out.println(key1);
        System.out.println(key2);
        System.out.println(key3);

    }

}
