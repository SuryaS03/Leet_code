class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li=new ArrayList<>();
        HashSet <Integer> hs=new HashSet<>();
        for(int i:nums)
        hs.add(i);
for(int i=0;i<nums.length;i++){
    if(hs.contains(i+1))
    continue;
    else
    li.add(i+1);
}
       
        
        return li;
    }
}