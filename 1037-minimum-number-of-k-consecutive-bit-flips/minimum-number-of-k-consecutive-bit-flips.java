class Solution {

    public int minKBitFlips(int[] nums, int k) {
        int currWinFlipCnt = 0, totalFlipCnt = 0, size = nums.length;
        for(int indx = 0; indx < size; indx++){
           if(indx >= k){
              int prevWinStartIndx = indx - k;
              if(nums[prevWinStartIndx] == 2)currWinFlipCnt--;
           } 
           if(currWinFlipCnt % 2 == nums[indx]){
              if(indx + k - 1 >= size)return -1;
              nums[indx] = 2;
              currWinFlipCnt++;
              totalFlipCnt++;
           }         
        }
        return totalFlipCnt;
    }
}