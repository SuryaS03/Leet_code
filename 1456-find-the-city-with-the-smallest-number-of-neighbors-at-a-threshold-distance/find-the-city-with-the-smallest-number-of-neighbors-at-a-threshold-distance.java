class Solution {
    public int findTheCity(int n, int[][] edges, int dt) {

       int adj[][]=new int[n][n];
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            adj[i][j]=(int)1e8;
            if(i==j)
            adj[i][j]=0;
            
        }
       }
      
       for(int []edge:edges){
        adj[edge[0]][edge[1]]=edge[2];
        adj[edge[1]][edge[0]]=edge[2];
        // adj[edge[0]edge[1]]
       }


        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    adj[i][j]=Math.min(adj[i][j],adj[i][k]+adj[k][j]);
                }
            }

        }
        int minCount=n;
        int ind=-1;
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
if(adj[i][j]<=dt && adj[i][j]!=(int)1e8){
    count++;
}

            }
            if(count<=minCount){
                minCount=count;
                ind=i;
            }


        }
        return ind;
        
        

        
    }
}