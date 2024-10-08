class Solution {
public static void solve(String s,int idx,int part,List<String> res,String cur){
    if(idx==s.length()){
        if(part==4)
        res.add(cur.substring(0,cur.length()-1));
        return;
    }
    for(int i=idx;i<s.length();i++){
        if(isValid(s.substring(idx,i+1))){
            solve(s,i+1,part+1,res,cur+s.substring(idx,i+1)+".");
        }
    }
}

public static boolean isValid(String s){
    if(s.length()>3)
    return false;
    if(s.length()>1 && s.charAt(0)=='0')
    return false;
    int a=Integer.parseInt(s);
    if(a<0 || a>255)
    return false;
    return true;
}




    public List<String> restoreIpAddresses(String s) {
        List <String> res=new ArrayList<>();
        solve(s,0,0,res,"");
        return res;
    }
}