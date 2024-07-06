class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        int flip=0;
       for(int i=0;i<nums.length;i++){

if(nums[i]==0 && flip%2==0){
    count++;
    flip++;
}
if(nums[i]==1 && flip %2==1)
{
    count++;
    flip++;
}

       }
       return count;

    }
}