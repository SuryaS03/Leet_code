class Solution {
    public int splitNum(int num) {
        int arr[]=new int[(int)Math.log(num)+1];
        int i=0;
        int n=num;
        while(n>0){
            arr[i++]=n%10;
            n/=10;
        }
        Arrays.sort(arr);
        int val1=0;
        int val2=0;
        for(int j=0;j<arr.length;j++){
            val1=val1*10+arr[j];
            j++;
            if(j<arr.length)
            val2=val2*10+arr[j];
        }
        return val1+val2;
    }
}