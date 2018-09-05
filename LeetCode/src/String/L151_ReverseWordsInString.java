package String;

import java.util.Arrays;
import java.util.Collections;

public class L151_ReverseWordsInString {
    public static String solution1_own(String s){
        String[] strings = s.trim().split(" +");
        String[] results = new String[strings.length];
        for (int i = 0; i<strings.length; i++){
            results[i] = new StringBuilder(strings[i]).reverse().toString().trim();
        }
        String result = String.join(" ", results);
        return new StringBuilder(result).reverse().toString();
    }

    public static String solution2(String s){
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String a = "a   b";
        String[] test = a.trim().split(" +");
        System.out.println(test[1]);
        System.out.println(test[1].length());
    }
}
