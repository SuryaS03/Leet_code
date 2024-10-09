class Solution {

    public static void binSearch(List<Integer> li,int n){
        int st=0;
        int end=li.size()-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(li.get(mid)<n){
                st=mid+1;
            }
            else{
                end=mid-1;
            }}
            li.set(st,n);
        
    }


    public int lengthOfLIS(int[] nums) {
       List <Integer> li=new ArrayList<>();
       li.add(nums[0]);
       for(int i=1;i<nums.length;i++){
        if(li.get(li.size()-1)<nums[i])
        li.add(nums[i]);
        else{
            binSearch(li,nums[i]);
        }
       }
       return li.size();
    }
}