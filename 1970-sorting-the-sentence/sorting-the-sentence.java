class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        int n=arr.length;
        int nums[]=new int[arr.length];
        for(int i=0;i<n;i++){
            String q=arr[i];
            nums[i]=q.charAt(q.length()-1)-'0';
            String t="";
            for(int y=0;y<q.length()-1;y++){
                t=t+q.charAt(y);
            }
            arr[i]=t;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                    String st= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=st;
                }
            }
        }
        String ans="";
        for(int i=0;i<n;i++){
            ans=ans+arr[i]+" ";
        }
        return ans.trim();
    }
}