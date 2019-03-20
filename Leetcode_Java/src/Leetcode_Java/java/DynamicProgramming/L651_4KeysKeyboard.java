package DynamicProgramming;

/*
https://leetcode.com/problems/4-keys-keyboard/
Imagine you have a special keyboard with the following keys:

Key 1: (A): Print one 'A' on screen.

Key 2: (Ctrl-A): Select the whole screen.

Key 3: (Ctrl-C): Copy selection to buffer.

Key 4: (Ctrl-V): Print buffer on screen appending it after what has already been printed.

Now, you can only press the keyboard for N times (with the above four keys), find out the maximum numbers of 'A' you can print on screen.

Example 1:
Input: N = 3
Output: 3
Explanation:
We can at most get 3 A's on screen by pressing following key sequence:
A, A, A
Example 2:
Input: N = 7
Output: 9
Explanation:
We can at most get 9 A's on screen by pressing following key sequence:
A, A, A, Ctrl A, Ctrl C, Ctrl V, Ctrl V
Note:
1 <= N <= 50
Answers will be in the range of 32-bit signed integer.

https://leetcode.com/problems/4-keys-keyboard/discuss/105980/Java-4-lines-recursion-with-step-by-step-explanation-to-derive-DP
 */
public class L651_4KeysKeyboard {

    public int maxA(int n){
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n ; i++){
            dp[i] = i;

            for (int j = 1; j <= i - 3; j++){
                // j is how many A we want to create before copy
                dp[i] = Math.max(dp[i], dp[j] * (i - j - 1));
                // max dp[i] will be no copy - dp[i] vs. copy j As, i-j-1 times
            }
        }
        return dp[n];
    }
}

