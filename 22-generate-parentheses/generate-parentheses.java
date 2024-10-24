class Solution {

    public void solve(int open,int close,String s,List<String> li)
{
    if(open==0 && close ==0){
        li.add(s);
        return;
    }
    if(open>0){
        solve(open-1,close,s+"(",li);
    }
    if(close>0 && close>open)
    solve(open,close-1,s+")",li);
}


    public List<String> generateParenthesis(int n) {
        
        List <String> li=new ArrayList<>();
        solve(n,n,"",li);
        return li;
    }
}