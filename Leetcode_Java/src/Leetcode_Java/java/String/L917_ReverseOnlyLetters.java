package String;

/*
https://leetcode.com/problems/reverse-only-letters/
Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.



Example 1:

Input: "ab-cd"
Output: "dc-ba"
Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
https://leetcode.com/problems/reverse-only-letters/discuss/178419/C%2B%2BJavaPython-Two-Pointers
 */

public class L917_ReverseOnlyLetters {
    public static String reverseOnlyLetters(String S){
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = S.toCharArray();
        int l = chars.length;
        int i = 0, j = l-1;
        while (i < j){
            while (i < j && !Character.isLetter(chars[i])){
                i++;
            }
            while (i < j && !Character.isLetter(chars[j])){
                j--;
            }
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        reverseOnlyLetters("ab-cd");
    }
}
