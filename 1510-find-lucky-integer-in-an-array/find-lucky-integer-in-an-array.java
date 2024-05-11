class Solution {
    public int findLucky(int[] arr) {
        int count[]=new int[arr.length];
        HashMap<Integer,Integer>hm=new HashMap<>();
       for(int i=0;i<arr.length;i++)
       {
        if(!hm.containsKey(arr[i]))
        {
            hm.put(arr[i],1);
        }
        else
        {
            hm.put(arr[i],hm.get(arr[i])+1);
        }
       }
       ArrayList<Integer>li=new ArrayList<>();
       int k=hm.size();
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]==hm.get(arr[i]))
        {
            li.add(arr[i]);
        }
       }
       if(li.size()==0)
       {
        return -1;
       }
       int res=Collections.max(li);
       return res;
    
    }
}