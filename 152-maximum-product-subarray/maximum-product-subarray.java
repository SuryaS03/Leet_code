class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0],min=nums[0],ans=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(nums[i],nums[i]*max);
            min=Math.min(nums[i],nums[i]*min);
            ans=Math.max(max,ans);
        }
        return ans;
        
    }
}