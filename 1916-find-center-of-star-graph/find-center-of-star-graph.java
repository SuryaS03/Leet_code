class Solution {
    public int findCenter(int[][] edges) {
        int rlen=edges.length;

        // for(int i=0;i<rlen-1;i++){
        //     for(int j=0;j<2;j++){
        //         if(edges[i][1]==edges[j][0])
        //         return edges[i][1];
        //     }
        // }
        for(int i=0;i<rlen-1;i++){
            if(edges[i][1]==edges[i+1][0])
              return edges[i][1];

        }


        return 3;
    }
}