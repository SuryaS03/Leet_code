class Solution {

public static boolean isPali(String s){
    int i=0;
    int j=s.length()-1;
    while(i<j){
        if(s.charAt(i)!=s.charAt(j))
        return false;
        i++;
        j--;
    }
    return true;
}


    public static void part(String s,int idx,List<List<String>> res,List<String> cur){
        if(idx==s.length()){
            res.add(new ArrayList(cur));
            return ;
        }
        for(int i=idx;i<s.length();i++){
            if(isPali(s.substring(idx,i+1))){
                cur.add(s.substring(idx,i+1));
                part(s,i+1,res,cur);
                cur.remove(cur.size()-1);
            }
        }
    }



    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> cur =new ArrayList<>();
        part(s,0,res,cur);
        return res;

    }
}