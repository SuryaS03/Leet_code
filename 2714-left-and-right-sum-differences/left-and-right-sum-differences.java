class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len=nums.length;
        int lsum[]=new int[len];
        int rsum[]=new int[len];
        int result[]=new int[len];
        lsum[0]=0;
        rsum[len-1]=0;
        int sum=0;
        int sum2=0;
        int j=0;
        int k=len-1;

        for(int i=0;i<len-1;i++){
             sum=sum+nums[i];
            lsum[++j]=sum;
        }
           for(int i=len-1;i>0;i--){
             sum2=sum2+nums[i];
            rsum[--k]=sum2;
        }
        for(int i=0;i<len;i++){
            result[i] =Math.abs(lsum[i] - rsum[i]);

        }
        return result;

        
    }
}