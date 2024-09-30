class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        String res[]=new String[arr.length];
        for(String st:arr){
            int k=(st.charAt(st.length()-1))-'0';
            res[k-1]=st.substring(0,st.length()-1);
        }
        String ans="";
        for(String i:res){
            ans+=i+" ";
        }
        return ans.trim();
    }
}