class Solution {
    public int largestCombination(int[] can) {
        
      int bin[]=new int[32];
      for(int i=0;i<can.length;i++){
        for(int j=0;j<32;j++){
            int temp=can[i] & (1<<j);
            if(temp!=0)
            bin[j]++;
        }
      }
      int max=Integer.MIN_VALUE;
      for(int i:bin){
        if(i>max)
        max=i;
      }
      return max;

    }
}