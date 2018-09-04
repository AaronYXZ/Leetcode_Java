package String;

/*
// ToDo Corner Cases
Q:https://leetcode.com/problems/decode-ways/description/
S:https://leetcode.com/problems/decode-ways/discuss/30522/Java-2ms-DP-solution-with-detailed-explanation-and-inline-comments
 A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given a non-empty string containing only digits, determine the total number of ways to decode it.

Example 1:

Input: "12"
Output: 2
Explanation: It could be decoded as "AB" (1 2) or "L" (12).
Example 2:

Input: "226"
Output: 3
Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
 */
public class L91_DecodeWays {
    public static int solution1(String s){
        if (s.isEmpty() || s.charAt(0) - '0' == 0) return 0;

        int n = s.length();
        int[] waysToDecode = new int[n+1];
        waysToDecode[0] = 1;
        waysToDecode[1] = 1;

        for (int i = 1; i <n; i++){
            int curr = s.charAt(i) - '0';
            int prev = s.charAt(i-1)-'0';

            // can't make any progress, return 0
            if (prev == 0 && curr ==0 || (curr == 0 && (prev *10 + curr > 26))){
                return 0;
            }

            // can't use the previous value, can only get to this state from the previous
            else if (prev ==0 || (prev*10 + curr)>26){
                waysToDecode[i+1] = waysToDecode[i];
            }

            // can't use current state, can only get to this state from i-1 state
            else if (curr == 0){
                waysToDecode[i+1] = waysToDecode[i-1];
            }

            else {
                waysToDecode[i+1] = waysToDecode[i] + waysToDecode[i-1];
            }
        }

        return waysToDecode[n];
    }

    public static void main(String[] args) {
        String test1 = "2260";
        System.out.println(solution1(test1));
    }
}
