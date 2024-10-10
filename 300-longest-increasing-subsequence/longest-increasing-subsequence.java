class Solution {

public static int solve(int[]nums, int idx,int pidx,int[][]dp){
    if(idx==nums.length)
    return 0;

    if(dp[idx][pidx+1]!=-1)
    return dp[idx][pidx+1];

    int nt=solve(nums,idx+1,pidx,dp);
    int t=0;
    if(pidx==-1|| nums[idx]>nums[pidx])
    t=1+solve(nums,idx+1,idx,dp);

    dp[idx][pidx+1]=Math.max(nt,t);
    return dp[idx][pidx+1];
}



    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n][n+1];
        for(int i=0;i<n;i++)
        Arrays.fill(dp[i],-1);
       return solve(nums,0,-1,dp);
        
    }
}