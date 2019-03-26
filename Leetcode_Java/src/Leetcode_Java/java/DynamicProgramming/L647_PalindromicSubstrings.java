package DynamicProgramming;

public class L647_PalindromicSubstrings {
    public static int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        int result = 0;
        for (int i = 0; i < n; i++){
            for (int j = i; j >= 0; j--){
                if (j - i == 0){
                    dp[j][i] = true;
                }
                else{
                    dp[j][i] = (s.charAt(i) == s.charAt(j)  && (i - j < 3 || dp[j+1][i-1]));
                }
                if (dp[j][i]) result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int r = countSubstrings("aaaaa");
        System.out.println(r);
    }
}
