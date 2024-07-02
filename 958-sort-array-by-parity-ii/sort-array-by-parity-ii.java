class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int odd[]=new int[nums.length/2];
        int even[]=new int[nums.length/2];
        int o=0;
        int e=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
            even[e++]=nums[i];
            else
            odd[o++]=nums[i];
        }
        int idx=0;
        for(int i=0;i<even.length;i++){
nums[idx++]=even[i];
nums[idx++]=odd[i];
        }
        return nums;
    }
}