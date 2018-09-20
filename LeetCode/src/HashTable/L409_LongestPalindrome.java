package HashTable;

import java.util.HashSet;
import java.util.Set;

public class L409_LongestPalindrome {

    public static int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                count++;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        return (!set.isEmpty()? count*2 + 1: count * 2);

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("daefvafvfwesdfaef"));
    }
}
