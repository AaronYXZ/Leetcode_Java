package String;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
/*
https://leetcode.com/problems/flip-game/description/
You are playing the following Flip Game with your friend: Given a string that contains only these two characters: + and -, you and your friend take turns to flip two consecutive "++" into "--". The game ends when a person can no longer make a move and therefore the other person will be the winner.

Write a function to compute all possible states of the string after one valid move.

Example:

Input: s = "++++"
Output:
[
  "--++",
  "+--+",
  "++--"
]
 */

public class L293_FlipGame {
    public static List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++){
            if (s.charAt(i) == '+' && s.charAt(i+1) == '+'){
                result.add(StringUtils.join(s.substring(0, i) ,"--", s.substring(i+2)));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generatePossibleNextMoves("++++"));
        String test = "abcdef";
        System.out.println(test.substring(0,2) + test.substring(3,4));
    }
}
