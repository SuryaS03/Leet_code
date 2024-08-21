class Solution {
    public String reverseOnlyLetters(String s) {
        
        char ch[]=s.toCharArray();
        int front=0;
        int end=s.length()-1;
        while(front < end){
           if(!Character.isLetter(ch[front]))
           {
            front++;
            continue;
           }
            if(!Character.isLetter(ch[end]))
           {
            end--;
            continue;
           }           
            char temp=ch[front];

            ch[front]=ch[end];
            ch[end]=temp;
            front++;
            end--;
        }
       String st=new String(ch);
       return st;
    }
}