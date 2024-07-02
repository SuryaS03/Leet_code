class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 0) return -1; 
        
        int maxidx = 0; 
        int max = nums[0];

               for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxidx = i;
            }
        }

     
        for (int i = 0; i < nums.length; i++) {
            if (i != maxidx && max < 2 * nums[i]) {
                return -1;
            }
        }

        return maxidx;
    }
}


      

