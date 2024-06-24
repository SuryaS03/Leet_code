class Solution {
    public void dfs(char grid[][],int i,int j,boolean vis[][]){
int r=grid.length;
int c=grid[0].length;
if(i<0 || i>=r || j<0 || j>=c || grid[i][j]=='0' || vis[i][j])
return;


vis[i][j]=true;
dfs(grid,i+1,j,vis);
dfs(grid,i-1,j,vis);
dfs(grid,i,j+1,vis);
dfs(grid,i,j-1,vis);

    }

    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean [][] vis=new boolean[r][c];
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'&& !vis[i][j]){
                    count++;
                    dfs(grid,i,j,vis);
                }
            }
        }
        return count;
    }
}