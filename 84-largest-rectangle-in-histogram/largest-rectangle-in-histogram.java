class Solution {
    public int largestRectangleArea(int[] height) {
        int max=0;
        int ns=-1;
        int prev=-1;
        int val=-1;
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<height.length;i++){
            if(st.isEmpty()){
                st.push(i);
                continue;
            }
           while(!st.isEmpty() && height[st.peek()]>height[i]){
            ns=i;
            val=height[st.pop()];
            prev=st.isEmpty()?-1:st.peek();
            max=Math.max(max,(ns-prev-1)*val);
            
           }
           st.push(i);
        }
         while(!st.isEmpty()){
            ns=height.length;
            val=height[st.pop()];
            prev=st.isEmpty()?-1:st.peek();
            max=Math.max(max,(ns-prev-1)*val);
            
           }
           return max;



    }
}