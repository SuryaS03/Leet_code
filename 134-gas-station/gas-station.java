class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
          int stidx=0;
        int cur=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            cur+=(gas[i]-cost[i]);
            if(cur<0){
                stidx=i+1;
                cur=0;
            }
        }
        cur=0;
        for(int i=0;i<n;i++){
            int v=(i+stidx)%n;
            cur+=gas[v]-cost[v];
            if(cur<0)
            return -1;
            
        }
        return stidx;
    }
}