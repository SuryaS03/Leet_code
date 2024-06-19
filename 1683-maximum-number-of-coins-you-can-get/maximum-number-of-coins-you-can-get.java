class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum=0;
        int k=0;
        for(int i=piles.length-2;i>k;i-=2){
            sum+=piles[i];
            k++;
        }
        return sum;
    }
}