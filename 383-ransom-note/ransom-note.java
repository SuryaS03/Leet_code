class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

char ch[]=ransomNote.toCharArray();
char mg[]=magazine.toCharArray();
int count=0;
for(char c:ch){
   for(int i=0;i<mg.length;i++){
    if(c==mg[i]){
        count++;
        mg[i]='*';
        break;
    }

   }}
   if(count>=ch.length)
   return true;
   return false;




        
    }
}