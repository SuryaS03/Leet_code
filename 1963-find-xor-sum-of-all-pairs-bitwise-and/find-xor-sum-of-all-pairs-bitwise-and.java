class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {

     int ans1=0;
     int ans2=0;
     for(int i:arr1){
     ans1=ans1^i;   
    }
     for(int i:arr2){
     ans2=ans2^i;   
    }
    return ans1&ans2;
}}