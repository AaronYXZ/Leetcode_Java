package HashTable;

import java.util.HashSet;
import java.util.Set;

public class L409_LongestPalindrome {

    public static int longestPalindrome(String s) {
        Set<Character> sets = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()){
            if (sets.contains(c)){
                count++;
                sets.remove(c);
            }
            else{
                sets.add(c);
            }
        }
        return sets.isEmpty() ? (count * 2) : (count * 2 + 1) ;

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("daefvafvfwesdfaef"));
    }
}
