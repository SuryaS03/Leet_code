class Solution {
    public boolean check(int[] nums) {
        int change=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i])
            change++;
        }
        if(nums[nums.length-1]>nums[0])
        change++;
        return change<=1;
    }
}