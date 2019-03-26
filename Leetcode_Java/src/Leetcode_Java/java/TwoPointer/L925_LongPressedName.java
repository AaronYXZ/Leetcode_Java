package TwoPointer;

/*
https://leetcode.com/problems/long-pressed-name/

Your friend is typing his name into a keyboard.  Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard.  Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.



Example 1:

Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.
Example 2:

Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
Example 3:

Input: name = "leelee", typed = "lleeelee"
Output: true
Example 4:

Input: name = "laiden", typed = "laiden"
Output: true
Explanation: It's not necessary to long press any character.

https://leetcode.com/problems/long-pressed-name/discuss/183994/C%2B%2BJavaPython-Two-Pointers
 */
public class L925_LongPressedName {
    public boolean isLongPressedName(String name, String typed){
        int i = 0, n = name.length(), t = typed.length();
        for (int j = 0; j < t; j++){
            if (i < n && name.charAt(i) == typed.charAt(j)){
                i++;
            }
            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)){
                return false;
            }
        }
        return i == n;
    }
}
