class Solution {
    public int[] sortByBits(int[] arr) {
int n=arr.length;
Arrays.sort(arr);
        int bin[]=new int[arr.length];
        for(int i=0;i<n;i++){

int val=arr[i];
int count=0;
while(val>0){
    int m=val%2;
    if(m==1)
    count++;
    val/=2;
}
bin[i]=count;

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(bin[j]>bin[j+1]){
                    int temp=bin[j+1];
                    bin[j+1]=bin[j];
                    bin[j]=temp;

                    int temp2=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp2;
                }
            }
        }
        return arr;

        
    }
}