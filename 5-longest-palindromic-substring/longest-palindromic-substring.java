class Solution {

        public static String fun(String s,int l,int r){
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
          {  l--;
            r++;}
        
        return s.substring(l+1,r);}




    public String longestPalindrome(String s) {
        
        String odd="";
        String even="";
        String max=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            odd=fun(s,i,i);
            even=fun(s,i,i+1);
            if(odd.length()>max.length())
            max=odd;
           if(even.length()>max.length())
           max=even;

        }
        return max;
    }
}