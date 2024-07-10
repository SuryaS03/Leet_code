class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        
        dp[0]=1;
        dp[1]=1;
        int i=0;
        for( i=2;i<=n;i++)
        dp[i]= dp[i-1]+dp[i-2];
        return dp[n];
        // if(n==1||n==0)
        // return 1;
        // int right=climbStairs(n-1);
        // int left=climbStairs(n-2);
        // return right+left;
    }
}