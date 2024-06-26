class Solution {
    public int xorBeauty(int[] nums) {
        int ans1=0;
        for(int i:nums)
        ans1=ans1^i;
        return ans1;
    }
}