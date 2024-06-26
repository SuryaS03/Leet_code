class Solution {
    public int singleNumber(int[] nums) {
        // Arrays.sort(nums);
        int ans=0;
        for(int i:nums){
            ans=ans^i;
        }
        
        
        
   
   return ans; }
}