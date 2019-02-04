package Array;

/*
Q:
https://leetcode.com/problems/bulls-and-cows/description/

You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.

Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows.

Please note that both secret number and friend's guess may contain duplicate digits.

Example 1:

Input: secret = "1807", guess = "7810"

Output: "1A3B"

Explanation: 1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7.
Example 2:

Input: secret = "1123", guess = "0111"

Output: "1A1B"

Explanation: The 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow.
Note: You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.

S:
https://leetcode.com/problems/bulls-and-cows/discuss/74621/One-pass-Java-solution
 */
public class L299_BullsAndCows {
    public static String getHint(String secret, String guess){
        int bulls = 0;
        int cows = 0;
        int[] numberFreq = new int[10];

        for (int i = 0; i<secret.length(); i++){
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));
            if (s == g){
                bulls++;
            }
            else{
                if (numberFreq[g] > 0) cows++;
                if (numberFreq[s] <0) cows++;
                numberFreq[g]--; // pay attention to g and s: g >0, g--, s<0, s++
                numberFreq[s]++;
            }

        }

        return bulls + "A" + cows + "B";

    }
}
