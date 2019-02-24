package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class L76_MinimumWindowSubstring {
    public String minWindow(String s, String t){
        Map<Character, Integer> map = new HashMap<>();
        for (char c:t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int begin = 0, end = 0;
        int head = 0;
        int len = Integer.MAX_VALUE;
        int counter = map.size();
        while (end < s.length()){
            char tmp = s.charAt(end);
            if (map.containsKey(tmp)){
                map.put(tmp, map.get(tmp) - 1);
                if (map.get(tmp) == 0){
                    counter--;
                }
            }
            end++;

            while (counter == 0){
               char tmpc = s.charAt(begin);
               if (map.containsKey(tmpc)){
                   map.put(tmpc, map.get(tmpc) + 1);
                   if (map.get(tmpc) > 0){
                       counter ++;
                   }
               }
               if (end - begin < len){
                   len = end - begin;
                   head = begin;
               }
               begin++;
            }

        }
        if (len == Integer.MAX_VALUE) return "";
        return s.substring(head, head + len);
    }
}
