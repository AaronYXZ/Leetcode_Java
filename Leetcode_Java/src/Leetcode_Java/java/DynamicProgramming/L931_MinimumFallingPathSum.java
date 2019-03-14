package DynamicProgramming;

public class L931_MinimumFallingPathSum {
    public static int minFallingPathSum(int[][] A) {
        if (A == null || A.length == 0) return 0;
        int n = A.length;

        for (int i = 1; i < n; i++){
            for(int j = 0; j < n; j++){
                if (j == 0) A[i][j] = Math.min(A[i-1][j], A[i-1][j+1]) + A[i][j];
                else if (j == n-1) A[i][j] = Math.min(A[i-1][j-1], A[i-1][j]) + A[i][j];
                else A[i][j] = Math.min( A[i-1][j+1], Math.min(A[i-1][j-1], A[i-1][j])) + A[i][j];

            }
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            if (A[n-1][i] < result){
                result = A[n-1][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] A = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(minFallingPathSum(A));
    }
}
