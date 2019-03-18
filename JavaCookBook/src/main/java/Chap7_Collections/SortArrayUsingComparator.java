package Chap7_Collections;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Comparator for comparing strings ignoring first character.
 */

public class SortArrayUsingComparator {

    public static class SubstringComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            s1 = s1.substring(1);
            s2 = s2.substring(2);
            return s1.compareTo(s2);
        }

    }

    public static void main(String[] args) {

        String[] strings = {"painful", "mainly", "gaining", "raindrops"};

        Arrays.sort(strings);
        dump(strings, "using default");

        Arrays.sort(strings, new SubstringComparator());

        dump(strings, "using SubstringCOmparator");

    }

    static void dump(String[] strings, String title){
        for (int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
        System.out.println(title);
    }
}
