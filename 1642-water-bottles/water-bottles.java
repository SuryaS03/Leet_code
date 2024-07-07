class Solution {
    public int numWaterBottles(int nBot, int numEx) {
       int drunk=nBot;
        int empty=nBot;
        while(numEx<=empty){
            drunk++;
            empty=empty-numEx+1;
            
        }
return drunk;   
    }
}