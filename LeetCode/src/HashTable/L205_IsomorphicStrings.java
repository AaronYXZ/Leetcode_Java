package HashTable;

import java.util.HashMap;
import java.util.Map;

/*
Q:
https://leetcode.com/problems/isomorphic-strings/description/
S:

 */
public class L205_IsomorphicStrings {
    public static boolean solution(String s, String t){
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sChar != tChar){
                if (!map.containsKey(sChar)) {
                    map.put(sChar, tChar);
                }
                else if (map.get(sChar) != tChar){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("aa", "ab"));
        String s= "aa";
        String t = "ab";
        System.out.println("a");
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sChar != tChar){
                if (!map.containsKey(sChar)) {
                    map.put(sChar, tChar);
                }
                else if (map.get(sChar) != tChar){
                    System.out.println(sChar);
                }
            }
        }
        System.out.println("a");

    }
}
