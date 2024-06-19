class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int res[]=new int[2];
        
        int ans1=0;
        int ans2=0;
        for(int i:nums1){
            
            for(int j:nums2){
                if(i==j)
                    {ans1++;
                    break; }               
            }
        }
        for(int i:nums2){
            
            for(int j:nums1){
                if(i==j)
                    {ans2++;
                    break;}                
            }
        }
      
        
        res[0]=ans1;
        res[1]=ans2;
        return res;
    }
}