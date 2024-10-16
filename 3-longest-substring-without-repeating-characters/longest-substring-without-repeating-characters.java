class Solution {
    public int lengthOfLongestSubstring(String s) {
       int max=0;
       int l=0;int r=0;
       int arr[]=new int[128];
       for(l=0,r=0;r<s.length();r++){
        arr[s.charAt(r)]++;
        while(arr[s.charAt(r)]>1){
            --arr[s.charAt(l++)];
        }
        max=Math.max(max,r-l+1);

       }
       return max;


       

    }
}