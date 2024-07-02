class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=Math.abs(arr[0]-arr[1]);
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(diff!=Math.abs(arr[i]-arr[j]))
                return false;
                else
                break;
            }
        }
        return true;


    }
}