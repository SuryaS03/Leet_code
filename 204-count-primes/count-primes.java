class Solution {
    public int countPrimes(int n) {
int arr[]=new int [n];
if(n==0||n==1)
return 0;
for(int i=0;i<n;i++)
{
    arr[i]=1;
}



arr[0]=0;
arr[1]=0;
// arr[2]=false;
for(int i=2;i<n;i++){
        if(arr[i]==1)

       { 
        for(int j=2*i;j<n;j=j+i){
            arr[j]=0;
          
        }}
       

       }
       int res=0;
       for(int l:arr){
if(l==1)
res++;
       }
       return res;
    }

}