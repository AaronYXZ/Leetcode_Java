package Array;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/add-to-array-form-of-integer/description/
For a non-negative integer X, the array-form of X is an array of its digits in left to right order.  For example, if X = 1231, then the array form is [1,2,3,1].

Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.



Example 1:

Input: A = [1,2,0,0], K = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:

Input: A = [2,7,4], K = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
Example 3:

Input: A = [2,1,5], K = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
Example 4:

Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
Output: [1,0,0,0,0,0,0,0,0,0,0]
Explanation: 9999999999 + 1 = 10000000000


Note：

1 <= A.length <= 10000
0 <= A[i] <= 9
0 <= K <= 10000
If A.length > 1, then A[0] != 0
 */
public class L989_AddToArrayFormOfInteger {

    // The solution is to start from the end of array A, loop through every element. Use keeper and tmp to keep
    // current and next position number. After going through the array, check if extra number in K, do the same until K is 0
    public static List<Integer> addToArrayForm(int[] A, int K) {
        int keeper = 0;
        int tmp = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = A.length -1; i >= 0; i--) {
            tmp = K % 10;
            K /= 10;
            result.add(0, (A[i] + tmp + keeper) % 10);
            keeper = (A[i] + tmp + keeper) / 10;
        }
        while (K > 0) {
            tmp = K % 10;
            K /= 10;
            result.add(0, (tmp + keeper) % 10);
            keeper =(tmp + keeper) / 10;
        }
        if (keeper > 0) {
            result.add(0, keeper);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {7};
        int K = 993;
        System.out.println(addToArrayForm(A, K));
    }
}
