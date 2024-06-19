class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List <Integer> li= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            li.add(index[i],nums[i]);
        }
        int res[]=new int[nums.length];
        for(int j=0;j<nums.length;j++){
            res[j]=li.get(j);
        }
        return res;

        
    }
}