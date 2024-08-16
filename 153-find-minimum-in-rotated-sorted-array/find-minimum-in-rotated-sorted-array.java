class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int j=nums.length;
        int min=Integer.MAX_VALUE;
        while(i<j){
            if(nums[i]<min)
            min=nums[i];
            i++;


        }
        return min;
        
    }
}