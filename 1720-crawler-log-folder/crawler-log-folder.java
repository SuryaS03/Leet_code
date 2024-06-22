class Solution {
    public int minOperations(String[] logs) {
        Stack<String>st=new Stack<>();
        int count=0;
        for(String s:logs){

            if(s.equals("../") && !st.isEmpty()){
               st.pop(); 
               count=count-1;
            }else if(s.equals("./")){
                continue;
            }else if(!(s.equals("./")) && !(s.equals("../"))){
                st.push(s);
                count++;
            }
        }return count;
    }
}