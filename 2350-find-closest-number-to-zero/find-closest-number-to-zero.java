class Solution {
    public int findClosestNumber(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Math.abs(0-nums[i]);
        }
        Arrays.sort(arr);
     int key= arr[0];
     for(int i:nums){
        if(i==key)
        return i;
     }
     return -1*key;
        
    }
}