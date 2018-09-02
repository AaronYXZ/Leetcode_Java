package String;

import java.util.HashMap;

public class L13_RomanToInteger {
    public static int solution1(String s){

        if (s == null || s.length() == 0) return 0;

        HashMap<String, Integer> map = new HashMap<>();
        map.put("M",1000);
        map.put("D",500);
        map.put("C", 100);
        map.put("L", 50);
        map.put("X", 10);
        map.put("V", 5);
        map.put("I", 1);

        int total = map.get(s.charAt(0));
        for (int i = 1; i< s.length(); i++){
            int cur = map.get(s.charAt(i));
            int pre = map.get(s.charAt(i-1));
            total += cur;
            if (cur < pre) total = total - pre * 2;
        }

        return total;
    }

    public static void main(String[] args) {
        String s = "III";
        System.out.println(solution1(s));
        System.out.println("a");
    }
}
