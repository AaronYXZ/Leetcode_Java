package String;

/*
Q:https://leetcode.com/problems/valid-palindrome/description/
S:https://www.jiuzhang.com/solution/valid-palindrome/ solution2
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */

public class L125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^0-9a-z]", "");
        int i = 0, j = s.length()-1;
        while (i < j){
            if (s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }

    public static boolean solution1_naive(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char front = s.charAt(i);
            // if (front - 'a' >= 0 && 'z' - front >= 0)
            stringBuilder1.append(front);
            char back = s.charAt(n - i - 1);
            //            if (back - 'a' >= 0 && 'z' - back >= 0)
            stringBuilder2.append(back);
        }
        String s1 = stringBuilder1.toString();
        String s2 = stringBuilder2.toString();

        return s1.equals(s2);
    }

    public static boolean solution2(String s){
        int front = 0;
        int end = s.length()-1;
        while (front < end){
            while (front < s.length() && !isvalid(s.charAt(front))){
                front++;
            }
            if (front == s.length()) return true; // for empty string “.,,,”
            while (end >=0 && !isvalid(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(end))){
                break;
            }
            else {
                front ++;
                end --;
            }
        }
        return end <= front;
    }

    public static boolean isvalid(char c){
        return Character.isLetter(c) || Character.isDigit(c);
    }

    public static void main(String[] args) {
        System.out.println(solution1_naive("A man, a plan, a canal: Panama"));
        System.out.println(solution1_naive("0P"));
    }
}
