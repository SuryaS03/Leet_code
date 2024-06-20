class Solution {
    public int[] decompressRLElist(int[] nums) {
        List <Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                for(int j=1;j<=nums[i];j++){
                    li.add(nums[i+1]);
                }
            }
        }
       int arr[]=new int[li.size()];
       int z=0;
       for(int i:li){
        arr[z++]=i;
       }
        return arr;
        
    }
}