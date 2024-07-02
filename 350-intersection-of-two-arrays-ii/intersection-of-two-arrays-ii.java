class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        List <Integer>li1=new ArrayList<>();
        for(int i:nums1)
        li1.add(i);
        List <Integer>li2=new ArrayList<>();
         for(int i:nums2)
        li2.add(i);
        List <Integer>res=new ArrayList<>();

        for(int i:li1){
            int key=i;
            for(int j=0;j<li2.size();j++){
                if(key==li2.get(j)){
                    res.add(li2.remove(j));
                    break;
                }
            }
        }
        int ind=0;
        int resa[]=new int[res.size()];
        for(int i:res){
            resa[ind++]=i;
        }
return resa;

    }
}