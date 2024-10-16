class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;
        int dp[][] = new int[m][n];
        for (int i = 0; i < n; i++)
          {  dp[0][i] = matrix[0][i]-'0';
          res=Math.max(dp[0][i],res);}

        for (int i = 0; i < m; i++)
           { dp[i][0] = matrix[i][0]-'0';
           res=Math.max(dp[i][0],res);}
        
        int min = 0;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == '1') {
                    min = Math.min(dp[i - 1][j], dp[i][j - 1]);
                    min = Math.min(dp[i - 1][j - 1], min);
                    dp[i][j] = min + 1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        return res * res;

    }
}