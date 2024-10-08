class Solution {
 public static String fun(int l,int r,String s){
    while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
    {
        l--;
        r++;
    }
    return s.substring(l+1,r);
 }


    public String longestPalindrome(String s) {
        String res=s.substring(0,1);
        String odd="";
        String even="";

        for(int i=0;i<s.length();i++){
odd=fun(i,i,s);
even=fun(i,i+1,s);
if(odd.length()>res.length())
res=odd;
if(even.length()>res.length())
res=even;
        }
        return res;
    }
}