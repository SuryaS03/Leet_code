class Solution {
    public int countSquares(int[][] matrix) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][]=new int[m][n];
        int max=0;
        int res=0;
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
           if(dp[0][i]==1)
           res++;
        }
        for(int i=0;i<m;i++){
            dp[i][0]=matrix[i][0];
            if(dp[i][0]==1)
            res++;
            
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
               
    
                int min=Math.min(dp[i-1][j-1],dp[i-1][j]);
                min=Math.min(min,dp[i][j-1]);
                if(matrix[i][j]==1)
               { dp[i][j]=min+1;
                res+=dp[i][j];}

            }
        }
      
        if(matrix[0][0]==1)
        res--;
        return res;

    }
}