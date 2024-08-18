class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);



        return search(nums,original);
        
    }
    public int search(int nums[],int original)
   
       { int max=0; 
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original)
            {
          max=  original*=2;
            search(nums,max);}

        }
        return original;
       
        }
}