class Solution {
    public int[] arrayRankTransform(int[] arr) {

if(arr.length==0)
return new int[]{};
        HashSet <Integer> hs=new HashSet<>();
        for(int i:arr)
        hs.add(i);
         
         List <Integer> li=new ArrayList<>(hs);
         Collections.sort(li);
         HashMap<Integer,Integer> hm=new HashMap<>();
         for(int j=0;j<hs.size();j++){
            hm.put(li.get(j),j+1);
         }
        int res[]=new int[arr.length];
        for(int k=0;k<arr.length;k++){
            if(hm.containsKey(arr[k]))
            res[k]=hm.get(arr[k]);
        }
        return res;
    }
}