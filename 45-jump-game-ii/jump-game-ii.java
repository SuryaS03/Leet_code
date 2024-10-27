class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int reach=0;
        int steps=0;
        int n=nums.length-1;
        for(int i=0;i<n;i++){
            reach=Math.max(reach,i+nums[i]);
            if(i==steps)
           { jumps++;
            steps=reach;}
        }
        return jumps;
    }
}