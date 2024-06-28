class Solution {

public static void solve(int open,int close,String s,ArrayList<String> arr){
if(open==0 && close==0)
{arr.add(s);
return;}
if(open>0){
    solve(open-1,close,s+"(",arr);
}
if(close>0 && close>open)
solve(open,close-1,s+")",arr);

}

    public List<String> generateParenthesis(int n) {
    int i=0;
    int j=0;
    String s="";
ArrayList <String> arr =new ArrayList<>();
solve(n,n,s,arr);
    
    return arr;
    }
}