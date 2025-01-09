class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        int l=pref.length();
        for(String s:words){
            if(s.length()>=l &&pref.equals(s.substring(0,l)))
            c++;
        }
        return c;
        
    }
}