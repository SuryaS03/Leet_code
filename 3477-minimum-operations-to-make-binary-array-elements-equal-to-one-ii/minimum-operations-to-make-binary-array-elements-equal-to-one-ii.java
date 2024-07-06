class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        int flip=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==flip){
count++;
flip=1-flip;
            }
        }
        return count;

    }
}