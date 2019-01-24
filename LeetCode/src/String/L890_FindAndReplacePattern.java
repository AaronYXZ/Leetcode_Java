package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L890_FindAndReplacePattern {
    public static List<String> findAndReplacePattern(String[] words, String pattern){
        List<String> result = new ArrayList<>();
        int pl = pattern.length();
        for (String word : words){
            if (word.length() != pl) continue;
            Map<Character, Character> map = new HashMap<>();
            boolean flag = true;
            for (int i  = 0; i < pl; i++){
               char p = pattern.charAt(i);
               char w = word.charAt(i);
               if (!map.containsKey(p)){
                   map.put(p, w);
               } else if (map.get(p) != w){
                   flag = false;
               }
            }
            if (flag) result.add(word);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        List<String> result;
        result = findAndReplacePattern(words, pattern);
        System.out.println("a");

    }
}

