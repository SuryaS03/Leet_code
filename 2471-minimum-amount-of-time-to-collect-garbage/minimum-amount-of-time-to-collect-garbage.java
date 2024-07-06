class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
          HashMap<Character,Integer>hm=new HashMap<>();
          int gind=-1;
          int pind=-1;
          int mind=-1;
          for(int i=0;i<garbage.length;i++){
            String s=garbage[i];
            char ch[]=s.toCharArray();
        
            for(char c:ch){
                if(hm.containsKey(c)){
                    hm.put(c,hm.get(c)+1);
                }else{
                    hm.put(c,1);
                }
            }
          }
        
          for(int i=0;i<garbage.length;i++){
            if(garbage[i].contains("G")){
                gind=i;
            }
            if(garbage[i].contains("P")){
                pind=i;
            }
             if(garbage[i].contains("M")){
                mind=i;
            }
          }int gsum=0;
          for(int i=0;i<gind;i++){
            gsum+=travel[i];
          }
          int psum=0;
          for(int i=0;i<pind;i++){
            psum+=travel[i];
          }
          int msum=0;
          for(int i=0;i<mind;i++){
            msum+=travel[i];
          }
          return gsum+hm.getOrDefault('G', 0)+msum+hm.getOrDefault('M', 0)+psum+hm.getOrDefault('P', 0);
    }
}