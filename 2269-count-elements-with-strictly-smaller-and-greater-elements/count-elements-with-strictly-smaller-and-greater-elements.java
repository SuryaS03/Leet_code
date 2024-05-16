class Solution {
    public int countElements(int[] nums) {
      Arrays.sort(nums);
      int count=0;
      int f=nums[0];
      int l=nums[nums.length-1];
      for(int i:nums){
        if(i!=f && i!=l)
        count++;
      }
      return count;
        
    }
}