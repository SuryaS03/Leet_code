class Solution{
    static String decodeString(String s){
        Stack <String> string=new Stack<>();
        Stack <Integer> num=new Stack<>();
        int k=0;
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                k=(k*10)+(c-'0');
                continue;      
                }
               if(c=='['){
                   num.push(k);
                   k=0;
                   string.push(String.valueOf(c));
                   continue;
               } 
               if(c!=']'){
                   string.push(String.valueOf(c));
                   continue;
               }
               StringBuilder temp=new StringBuilder();
               while(!string.peek().equals("[")){
                   temp.insert(0,string.pop());
               }
               string.pop();
               int count=num.pop();
               StringBuilder res=new StringBuilder();
               for(int i=0;i<count;i++){
                   res.append(temp);
               }
               string.push(res.toString());
                
        }
        StringBuilder fin=new StringBuilder();
        while(!string.isEmpty()){
            fin.insert(0,string.pop());
        }
        return fin.toString();
        
    }
}