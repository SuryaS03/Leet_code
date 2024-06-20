class Solution {
    public String firstPalindrome(String[] words) {
        String res="";
        for(String str:words){
            String t="";
            for(int i=str.length()-1;i>=0;i--){
                t+=str.charAt(i);
    }
            if(t.equals(str))
               return str;

               
               
               
               }
    
            return res;   }}