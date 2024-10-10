class Solution {
    public void moveZeroes(int[] nums) {
        // Arrays.sort(nums);
        
        int val=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            
             int temp=nums[i];
             nums[i]=nums[val];
             nums[val]=temp;
           
               val++;
            }
        }
       
    }
}