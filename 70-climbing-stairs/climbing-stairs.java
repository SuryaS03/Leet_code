class Solution {
    public int climbStairs(int n) {
      int f=1;
      int s=1;
      int res=0;
      if(n==1)
      return 1;
      for(int i=2;i<=n;i++){
        res=f+s;
        f=s;
        s=res;
      }
      return res;
    }
}