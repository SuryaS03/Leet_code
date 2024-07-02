class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> hs=new HashSet<>();
        if(nums1.length<nums1.length){
        for(int i:nums1)
        {
            int key=i;
            for(int j:nums2){
                if(i==j)
                hs.add(i);
            }
        }}
        else{

             for(int i:nums2)
        {
            int key=i;
            for(int j:nums1){
                if(i==j)
                hs.add(i);
            }
        }

        }
        int res[]=new int[hs.size()];
        int ind=0;
        for(int k:hs){
res[ind++]=k;
        }
        
    
        return res;
        
    }
}