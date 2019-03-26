package HashTable;

import java.util.HashMap;
import java.util.Map;
/*
https://leetcode.com/problems/strobogrammatic-number/
 */
public class L246_StrobogrammaticNumber {
    public boolean isStrobogrammatic(String num){
        int l = num.length();
        Map<Character, Character> map = new HashMap<>();
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');
        map.put('0', '0');
        for (int i = 0; i * 2 < l; i++){
            if (!map.containsKey(num.charAt(i)) || map.get(num.charAt(i)) != num.charAt(l - 1- i)) return false;
        }
        return true;
    }
}
