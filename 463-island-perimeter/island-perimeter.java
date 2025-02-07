class Solution {

    public static boolean isSafe(int i,int j,int m,int n,int [][]grid){
        if(i>=0 && i<m && j<n && j>=0 )
        return true;
        return false;
    }






    public int islandPerimeter(int[][] grid) {
        int res=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                if(isSafe(i+1,j,m,n,grid)) {
                    if( grid[i+1][j]==0)
                    res++;
                }
                else
                res++;
                /////////////////
                if(isSafe(i-1,j,m,n,grid)) {
                    if( grid[i-1][j]==0)
                    res++;
                }
                else
                res++;
                if(isSafe(i,j-1,m,n,grid)) {
                    if( grid[i][j-1]==0)
                    res++;
                }
                else
                res++;
                if(isSafe(i,j+1,m,n,grid)){
                    if( grid[i][j+1]==0)
                    res++;
                }
                else
                res++;


            }
            }
        }
        return res;
        
    }
}