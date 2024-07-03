class Solution {
    public int minimumOperations(int[] nums) {
        
int op=0;
for(int i:nums){
    if(i%3!=0){
        if((i+1)%3==0 ||(i-1)%3==0)
        op++;
    }
}
return op;


    }
}