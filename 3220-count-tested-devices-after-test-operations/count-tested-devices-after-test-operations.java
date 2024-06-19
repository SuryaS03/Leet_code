class Solution {
    public int countTestedDevices(int[] bp) {
        int len=bp.length;
        int count=0;
        for(int i=0;i<len;i++){
            if(bp[i]>0){
count++;
for(int j=i+1;j<len;j++){
    bp[j]=bp[j]-1;
}
            }
        }
        return count;
        
    }
}