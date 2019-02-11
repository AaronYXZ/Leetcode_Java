package Math;

/*
https://leetcode.com/problems/valid-perfect-square/description/
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Output: true
Example 2:

Input: 14
Output: false
https://leetcode.com/problems/valid-perfect-square/discuss/83874/A-square-number-is-1+3+5+7+...-JAVA-code
 */
public class L367_ValidPerfectSquare {
    public static boolean isPerfectSquare(int num){
        // timed out solution
        int l = 0, r = Integer.MAX_VALUE;
        while (l < r){
            int mid = l + ( r - l) /2;
            if (mid < num / mid){
                l = mid ;
            }
            else if (mid > num / mid){
                r = mid;
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static boolean isPerfecSquare2(int num){
        int i = 1;
        while(num > 0){
            num-=i;
            i+=2;
        }
        return num == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}
