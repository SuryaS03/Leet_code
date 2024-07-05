class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int len=arr.length;
        int count=0;
        for(int e:arr){
            if(e==0)
            count++;
            if(count>1)
            return true;
        }
        for(int i=0;i<len;i++){
            if(arr[i]==0)
            continue;
            for(int j=0;j<len;j++){
                if(arr[i]==2*arr[j])
                return true;
            }
        }
return false;
    }
}