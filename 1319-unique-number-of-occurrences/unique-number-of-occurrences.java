class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        List <Integer>li=new ArrayList<>();
        for(Map.Entry <Integer,Integer> set:hm.entrySet()){
          li.add(set.getValue());
        }
        Collections.sort(li);
        // if(li.size()==2)
        // return false;
        if (li.size() == 2 && li.get(0).equals(li.get(1))) 
            return false;
        for(int j=0;j<li.size()-1;j++){
            if(li.get(j)==li.get(j+1))
            return false;
           
        }
     
        
    return true;  } 
}