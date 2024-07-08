class Solution {
    public boolean divideArray(int[] nums) {
       HashMap<Integer,Integer> hm=new HashMap<>();
for(int i:nums){
    if(hm.containsKey(i))
    hm.put(i,hm.get(i)+1);
    else
    hm.put(i,1);
}
for(Map.Entry<Integer,Integer>h:hm.entrySet()){
    if(h.getValue()%2==1)
    return false;
}
return true;

    }
}