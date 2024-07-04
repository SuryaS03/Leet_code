class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n=points.length;
        int max=0;
        for(int i=0;i<n-1;i++){
            max=max+Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
        }
        return max;
    }
}