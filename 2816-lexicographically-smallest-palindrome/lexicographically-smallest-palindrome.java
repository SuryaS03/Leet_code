class Solution {
    public String makeSmallestPalindrome(String s) {
       char ch[]=s.toCharArray();
        int st=0;
        int lt=s.length()-1;
        while(st<lt){
if(ch[st]==ch[lt])
{st++;
lt--;}
else{
    if(ch[st]>ch[lt]){
        ch[st]=ch[lt];
    }
    else
    ch[lt]=ch[st];
}

        }
        return String.valueOf(ch);
    }
}