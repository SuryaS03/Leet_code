class Solution {

public static int sub(String s1,String s2,int m,int n,int[][]dp){

if(m==0 || n==0)
return 0;
   if (dp[m][n] != -1)
            return dp[m][n];

if(s1.charAt(m-1)==s2.charAt(n-1)){
  return  dp[m][n]= 1+sub(s1,s2,m-1,n-1,dp);
}

   return dp[m][n]=Math.max(sub(s1,s2,m-1,n,dp),sub(s1,s2,m,n-1,dp));


}

    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
 dp[m][n]=sub(text1,text2,m,n,dp);
return dp[m][n];
    }
}