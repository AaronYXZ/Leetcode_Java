package HashTable;

/*
https://leetcode.com/problems/sparse-matrix-multiplication/
Given two sparse matrices A and B, return the result of AB.

You may assume that A's column number is equal to B's row number.

Example:

Input:

A = [
  [ 1, 0, 0],
  [-1, 0, 3]
]

B = [
  [ 7, 0, 0 ],
  [ 0, 0, 0 ],
  [ 0, 0, 1 ]
]

Output:

     |  1 0 0 |   | 7 0 0 |   |  7 0 0 |
AB = | -1 0 3 | x | 0 0 0 | = | -7 0 3 |
                  | 0 0 1 |
https://leetcode.com/problems/sparse-matrix-multiplication/discuss/76154/Easiest-JAVA-solution
 */

public class L311_SparseMatrixMultiplication {
    public int[][] multiply(int[][] A, int[][] B){
        int m = A.length, n = A[0].length, nB = B[0].length;
        int[][] result = new int[m][nB];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (A[i][j] != 0){
                    for (int k = 0; k < nB; k++){
                        if (B[j][k] != 0){
                            result[i][k] += A[i][j] * B[j][k];
                        }
                    }
                }
            }
        }
        return result;
    }
}
