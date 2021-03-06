package String;

/*
https://leetcode.com/problems/one-edit-distance/description/
Given two strings s and t, determine if they are both one edit distance apart.

Note:

There are 3 possiblities to satisify one edit distance apart:

Insert a character into s to get t
Delete a character from s to get t
Replace a character of s to get t
Example 1:

Input: s = "ab", t = "acb"
Output: true
Explanation: We can insert 'c' into s to get t.
Example 2:

Input: s = "cab", t = "ad"
Output: false
Explanation: We cannot get t from s by only one step.
Example 3:

Input: s = "1203", t = "1213"
Output: true
Explanation: We can replace '0' with '1' to get t.

https://leetcode.com/problems/one-edit-distance/discuss/50098/My-CLEAR-JAVA-solution-with-explanation
 */

public class L161_OneEditDistance {

    public boolean isOneEditDistance(String s, String t) {
        /*
 * There're 3 possibilities to satisfy one edit distance apart:
 *
 * 1) Replace 1 char:
 	  s: a B c
 	  t: a D c
 * 2) Delete 1 char from s:
	  s: a D  b c
	  t: a    b c
 * 3) Delete 1 char from t
	  s: a   b c
	  t: a D b c
 */

        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                // s and t has the same lenght, so the only possiblitiy is replacing one char in s and t
                if (s.length() == t.length()) {
                    return s.substring(i + 1).equals(t.substring(i + 1));
                }
                // // s is longer than t, so the only possibility is deleting one char from s
                else if (s.length() > t.length()) {
                    return s.substring(i + 1).equals(t.substring(i));
                }
                //  t is longer than s, so the only possibility is deleting one char from t
                else {
                    return s.substring(i).equals(t.substring(i + 1));
                }
            }
        }
        //All previous chars are the same, the only possibility is deleting the end char in the longer one of s and t
        return Math.abs(s.length() - t.length()) == 1;
    }
}
