class Solution {
    public int maxProduct(int[] nums) {
        int min=nums[0];
        int max=nums[0];
      int ans=nums[0];
      int z=0;
      for(int i:nums){
        if(z==0){
            z++;
            continue;
        }
        if(i<0){
            int temp=min;
            min=max;
            max=temp;
        }
        max=Math.max(i,i*max);
        min=Math.min(i,i*min);
        ans=Math.max(ans,max);
      }
      return ans;
        
    }
}