class Solution {
    public int minAddToMakeValid(String s) {

        // char ch[]=s.toCharArray();
        // Stack <Character> st=new Stack<>();
        while(s.contains("()")){
           s= s.replace("()","");
        }
        return s.length();
        
        
    }
}