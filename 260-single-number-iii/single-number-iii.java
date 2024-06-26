class Solution {
    public int[] singleNumber(int[] nums) {
        int ans=0;
        for(int i:nums){
ans=ans^i;
        }
    
      int val=1;
      
      while((ans & val) ==0){
        val<<=1;
      }
      int num1=0;
      int num2=0;
      for(int num:nums){
        if((num & val)==0)
        num1^=num;
        else
        num2^=num;
      }
      return new int[]{num1,num2};

      
    }
}