class Solution {
    public int minSwaps(String s) {
        char ch[]=s.toCharArray();
        int count=0;
        int swap=0;
        for(char c:ch){
            if(c=='['){
count++;

            }
            if(c==']'){
count--;
            }
            if(count==-1){
                swap++;
                count+=2;
            }
        }
        return swap;
        
    }
}