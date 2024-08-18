class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashSet <Integer> hs=new HashSet<>();

        for(int i:nums){
            hs.add(i);
        }
        int count=1;
        // int arr[]=hs
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1] )
            continue;
            if(hs.contains(nums[i]+1))
            count++;
            else
            {
                max=Math.max(max,count);
                count=1;
            }

        }
        return max;
    }
}