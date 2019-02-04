package Array;

/*
https://leetcode.com/problems/transpose-matrix/description/
Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.



Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]


Note:

1 <= A.length <= 1000
1 <= A[0].length <= 1000
 */
public class L867_TransposeMatrix {
    public int[][] transpose(int[][] A){
       int M = A.length, N = A[0].length;
       int[][] result = new int[N][M];
       for (int i = 0; i < N; i++){
           for (int j = 0; j < M; j++){
               result[i][j] = A[j][i];
           }
       }
       return result;
    }
}
