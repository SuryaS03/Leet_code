class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        char ch[]=word.toCharArray();
        int count =0;
        int i=0;
        int j=0;
        while(j<word.length()){
            if(ch[i]==ch[j])
           { count++;
           j++;}

            else{
                while(count>9){
                    sb.append(9).append(ch[i]);
                    count-=9;
                }
                sb.append(count).append(ch[i]);
                count=0;
                i=j;

            }
        }
         while(count>9){
                    sb.append(9).append(ch[i]);
                    count-=9;
                }
                sb.append(count).append(ch[i]);
       
        return sb.toString();
        
    }
}