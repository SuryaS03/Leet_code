class Solution {
    public String clearDigits(String s) {
char ch[]=s.toCharArray();
Stack <Character> st=new Stack<>();
for(char c:ch){
    if(c>=97 && c<=122)
    st.push(c);
    else if(!st.empty())
    st.pop();
}
String str="";
for(int i=0;i<st.size();i++){
    str+=st.get(i);
}
return str;

        
        
    }
}