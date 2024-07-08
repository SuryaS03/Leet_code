class Solution {
    public int minimumCost(int[] cost) {
Arrays.sort(cost);
int arr[]=new int[cost.length];
int z=0;
for(int i=cost.length-1;i>=0;i--){
    arr[z++]=cost[i];
}
int res=0;
int count=0;
for(int i=0;i<cost.length;i++){
if(count !=2){
    res+=arr[i];
    count++;
    
}else{
    count=0;
}
}
return res;
    }
}