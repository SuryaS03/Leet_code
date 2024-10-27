class Solution {
    public String largestGoodInteger(String num) {
        int max=Integer.MIN_VALUE;
        String res="";
        char ch[]=num.toCharArray();
        for(int i=0;i<num.length()-2;i++){
if(ch[i]==ch[i+1] && ch[i+1]==ch[i+2]){
    if(ch[i]-'0'>max){
        max=ch[i]-'0';
        res=""+ch[i]+ch[i+1]+""+ch[i+2];
    }
}
        }
        return res;
        
    }
}