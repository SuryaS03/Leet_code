class Solution {
    public int trap(int[] height) {
       int len=height.length;
       int l[]=new int[len];
       int r[]=new int[len];
       l[0]=height[0];
       int ans=0;
       int max=0;
       for(int i=1;i<len;i++)
        l[i]=Math.max(height[i],l[i-1]);
        max=0;
        r[len-1]=height[len-1];
       for(int i=len-2;i>=0;i--)
        r[i]=Math.max(height[i],r[i+1]);

        for(int i=0;i<len;i++){
            int sum=Math.min(l[i],r[i]);
            ans=ans+sum-height[i];

        }
        return ans;
       
        
    }
}