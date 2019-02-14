package Array;

/*
https://leetcode.com/problems/sort-array-by-parity-ii/description/
Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

You may return any answer array that satisfies this condition.



Example 1:

Input: [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.


Note:

2 <= A.length <= 20000
A.length % 2 == 0
0 <= A[i] <= 1000
 */
public class L922_SortArrayByParity2 {
    public static int[] sortArrayByParityII(int[] A){
        int odd = 1;
        for (int i = 0; i < A.length; i+=2){
            if (A[i] % 2 != 0){
                while(A[odd] % 2 != 0 && odd < A.length){
                    odd +=2;
                }
                int tmp = A[i];
                A[i] = A[odd];
                A[odd] = tmp;
            }
        }
        return A;
    }
}
