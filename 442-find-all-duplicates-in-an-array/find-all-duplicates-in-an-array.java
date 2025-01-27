class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len=nums.length;
        List <Integer> list =new ArrayList <Integer> ();
     HashMap <Integer,Integer> hm=new HashMap<>();
     for(int i:nums){
        if(hm.containsKey(i))
        list.add(i);
        else
        hm.put(i,1);
     }
        return list;
       
        
}}
