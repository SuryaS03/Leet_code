class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
        return s;
        char ch[][]=new char[numRows][s.length()];
        int i=0;
        int end=s.length();
        // int row=0;
        int col=0;
       int row=0;
        while(i<end){
            
            while(row<numRows && i<end){
                ch[row][col]=s.charAt(i);
                i++;
                row++;
            }
            row-=2;
            col++;
            while(row>=0 && i<end){
               
                ch[row][col]=s.charAt(i);
                i++;
                 row--;
                col++;
            }
            row+=2;
            col--;


        }
        String res="";
        for(int k=0;k<numRows;k++){
            for(int j=0;j<end;j++){
                if(ch[k][j]!='\0')
                res+=ch[k][j];
            }
        }
        return res;



    }
}