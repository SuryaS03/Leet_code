class Solution {
    public int maxArea(int[] height) {
        int st=0;
        int end=height.length-1;
        int max=0;
        while(st<=end){
            int min=Math.min(height[st],height[end]);
            max=Math.max(max,min*(end-st));
            if(height[st]<=height[end])
            st++;
            else
            end--;
        }
        return max;
    }
}