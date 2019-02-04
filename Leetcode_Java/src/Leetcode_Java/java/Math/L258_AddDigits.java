package Math;
/*
Q:
https://leetcode.com/problems/add-digits/description/
S:
https://leetcode.com/problems/add-digits/discuss/68667/Simple-Java-Solution-No-recursion-loop

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
             Since 2 has only one digit, return it.

 */
public class L258_AddDigits {
    public static int solution1_Loop(int n){
        int results = 0;
        do{
            results = helper(n);
            n = results;
        }
        while (n >=10);
        return results;

    }

    public static int helper(int n){
        int results = 0;
        while(n > 0){
            results += n % 10;
            n /= 10;
        }
        return results;
    }

    public static int solution2_noLoop(int n){
        if (n == 0) return 0;
        if (n % 9 ==0) return 9;
        else return n % 9;
    }

    public static void main(String[] args) {
        System.out.println(solution2_noLoop(10));
        System.out.println(solution2_noLoop(18));
        System.out.println(solution2_noLoop(981));
    }
}
