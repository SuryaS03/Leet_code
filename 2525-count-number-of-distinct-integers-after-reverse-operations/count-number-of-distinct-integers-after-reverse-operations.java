class Solution {
    public int countDistinctIntegers(int[] nums) {
        int len=nums.length;
        int rev[]=new int[len+len];

int k=0;
 for(int l=0;l<len;l++){
            rev[k++]=nums[l];
        }
        for(int i:nums){

int rev1=0;
while(i>0){
    int rem=i%10;
    rev1=rev1*10+rem;
    i/=10;
    
}
rev[k++]=rev1;


        }
       
         HashSet<Integer> set = new HashSet<>();
        for(int i:rev){
            set.add(i);
        }
       
        
        return set.size();
    }
}