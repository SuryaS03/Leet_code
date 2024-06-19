class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res=0;
        char challow[]=allowed.toCharArray();
        for(String s:words){
            char ch[]=s.toCharArray();
            int count=0;
            for(char c:ch){
for(char d:challow){
    if(c==d)
    count++;

}}
if(count==ch.length)
res++;


            }
        
        return res;
    }
}