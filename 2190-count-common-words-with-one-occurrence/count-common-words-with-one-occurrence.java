class Solution {
    public int countWords(String[] words1, String[] words2) {
HashMap<String,Integer> hm1=new HashMap<>();
HashMap<String,Integer> hm2=new HashMap<>();
int res=0;
for(String s:words1)
{
    if(hm1.containsKey(s))
    hm1.put(s,hm1.get(s)+1);
    else
    hm1.put(s,1);
}
for(String s:words2)
{
    if(hm2.containsKey(s))
    hm2.put(s,hm2.get(s)+1);
    else
    hm2.put(s,1);
}
for(Map.Entry <String,Integer> hm:hm1.entrySet()){
    if(hm.getValue()==1){
        if(hm2.containsKey(hm.getKey())){
           if( hm2.get(hm.getKey())==1)
            res++;

        }
    }
}
return res;


    }
}