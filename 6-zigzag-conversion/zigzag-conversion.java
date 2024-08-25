class Solution {
    public String convert(String s, int row) {
        if(row==1)
        return s;
        int len=s.length();
        char arr[]=s.toCharArray();
        char ch[][]=new char[row][len];
        int i=0;
        int r=0;
        int c=0;
        while(i<len){
            while(r<row && i<len){
                ch[r][c]=arr[i];
                i++;
                r++;

            }
            r-=2;
            c++;
            while(i<len && r>=0){
                ch[r][c]=arr[i];
                i++;
                r--;
                c++;
            }
            r+=2;
            c--;
        }
        String res="";
        for(int in=0;in<row;in++){
            for(int j=0;j<len;j++){
                if(ch[in][j]!='\0')
                res+=ch[in][j];
            }
        }
        return res;
        

    }
}