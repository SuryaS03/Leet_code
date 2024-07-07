class Solution {
    public long maximumHappinessSum(int[] hap, int k) {
        int dec=0;
        long res=0;
        Arrays.sort(hap);
        
    int arr[]=new int[hap.length];
    int z=0;
    for(int i=hap.length-1;i>=0;i--){
        arr[z++]=hap[i];
    }



        for(int i=0;i<k;i++){
            if(arr[i]-i>0)
res+=arr[i]-i;

        }
        return res;



    }
}