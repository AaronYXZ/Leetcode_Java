package String;

/*
Q:
https://leetcode.com/problems/find-the-difference/description/
Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.

Example:

Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.

S2 Bit Manipulation:
https://leetcode.com/problems/find-the-difference/discuss/86825/Java-solution-using-bit-manipulation

S2:
https://leetcode.com/problems/find-the-difference/discuss/86850/Simple-JAVA-8ms-solution-4-lines

 */

public class L389_FindTheDifference {

    public static char solution1(String s, String t){
        int intChar = (int) t.charAt(0);
        for (int i = 0; i< s.length(); i++){
            intChar -= s.charAt(i);
            intChar += t.charAt(i+1);
        }

        return (char) intChar;
    }

    public static void main(String[] args) {
        System.out.println(solution1("abdec", "decbfa"));
    }
}
