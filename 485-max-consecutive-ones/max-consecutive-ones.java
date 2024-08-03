class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i:nums){

            if(i==1)
            count++;
            else{
            max=max>count?max:count;
           
            count=0;
            }
             max=max>count?max:count;
            

        }
        return max;
        
    }
}