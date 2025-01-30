class Solution {
    public char repeatedCharacter(String s) {
        char ch[]=new char[26];
        for(char c:s.toCharArray()){
            ch[c-'a']++;
            if(ch[c-'a']==2)
            return c;
        }
        return 'a';
    }
}