package DynamicProgramming;
/*
https://leetcode.com/problems/arithmetic-slices/
A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.

For example, these are arithmetic sequence:

1, 3, 5, 7, 9
7, 7, 7, 7
3, -1, -5, -9
The following sequence is not arithmetic.

1, 1, 2, 5, 7

A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.

A slice (P, Q) of array A is called arithmetic if the sequence:
A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.

The function should return the number of arithmetic slices in the array A.


Example:

A = [1, 2, 3, 4]

return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.
https://leetcode.com/problems/arithmetic-slices/discuss/90058/Simple-Java-solution-9-lines-2ms
 */

public class L413_ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A){
        /*
        love the "curr += 1; sum += curr;" very much, that is amazing!!
For those guys who are confused about these two line:
"curr" the number of different "Arithmetic Slices" ends at index = i
a small example :
we have :[1, 2, 3, 4]
index = 2, we have curr = 1, sum = 1, which is [1,2,3];
index = 3, curr = 2, sum = 2 + 1 = 3; because we look back from index = 3 which is 4 , we will have two "Arithmetic Slices", which is [2,3,4] and [1,2,3,4]...
         */
        int curr = 0, sum = 0;
        for (int i = 2; i < A.length; i++){
            if (A[i] - A[i-1] == A[i-1] - A[i-2]){
                curr +=1;
                sum+=curr;
            }
            else {
                curr = 0;
            }
        }
        return  sum;
    }
}
