class Solution {
    public int lengthOfLIS(int[] nums) {
        int lis[]=new int[nums.length];
        Arrays.fill(lis,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && lis[i]<lis[j]+1)
                lis[i]=lis[j]+1;
            }
        }
        Arrays.sort(lis);
        return lis[nums.length-1];
    }
}