class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List <Integer>> res=new ArrayList<>();
        int i=0;
       
       
        Arrays.sort(nums);
        for( i=0;i<nums.length;i++){
          int  j=i+1;
           int k=nums.length-1;
             if (i != 0 && nums[i] == nums[i - 1]) continue;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List <Integer>li=Arrays.asList(nums[i],nums[j],nums[k]);
                    res.add(li);
                    j++;
                    k--;
                      while (j < k && nums[j] == nums[j - 1]) j++;
                while (j < k && nums[k] == nums[k + 1]) k--;
                   
                }
              
            }
             
            
        }
        return res;
    }
}