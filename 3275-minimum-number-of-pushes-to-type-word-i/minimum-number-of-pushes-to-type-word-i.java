class Solution {
    public int minimumPushes(String word) {
        
int n=word.length();
int res=0;
int type=1;
while(n>=8){
   
    res+=8*type;
     n=n-8;
    type++;
}
res+=n*type;
return res;

    }
}