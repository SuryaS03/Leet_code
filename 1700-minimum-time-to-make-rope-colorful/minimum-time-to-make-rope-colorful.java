class Solution {
    public int minCost(String colors, int[] neededTime) {
       int res=0; 
       int flag=0;

char ch[]=colors.toCharArray();
for(int i=1;i<ch.length;i++){

if(ch[i]==ch[i-1]){
res+=Math.min(neededTime[i],neededTime[i-1]);
neededTime[i]=Math.max(neededTime[i],neededTime[i-1]);


}

}
return res;

    }
}