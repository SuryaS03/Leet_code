class Solution {
    public String replaceDigits(String s) {
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
            int shift = ch[i] - '0'; 
                ch[i] = (char) (ch[i - 1] + shift);}
        }
        return String.valueOf(ch);

    }
}