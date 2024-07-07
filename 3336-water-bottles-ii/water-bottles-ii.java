class Solution {
    public int maxBottlesDrunk(int nBot, int numEx) {
        int drunk=nBot;
        int empty=nBot;
        while(numEx<=empty){
            drunk++;
            empty=empty-numEx+1;
            numEx++;
        }
return drunk;
    }
}