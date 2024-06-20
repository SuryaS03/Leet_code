class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int res=0;
        for(int i:nums){
            if(i<k)
            res++;
        }
        return res;
    }
}