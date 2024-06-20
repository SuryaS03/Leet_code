class Solution {
    public int maxFrequencyElements(int[] nums) {
HashMap <Integer,Integer>hm=new HashMap<>();
for(int i:nums){
    if(hm.containsKey(i))
    hm.put(i,hm.get(i)+1);
    else
    hm.put(i,1);
}
List <Integer>li=new ArrayList<>();
 for (Integer value : hm.values()) {
           li.add(value);
        }
         Collections.sort(li);
         int max=li.get(li.size()-1);
         int res=0;
for(int i=li.size()-1;i>=0;i--){
    if(max==li.get(i))
    {res+=li.get(i);
    }

}return res;
        
    }
}