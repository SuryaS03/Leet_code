class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int h1=fun(red,blue);
        int h2=fun(blue,red);
        return Math.max(h1,h2);
        
    }


    public static int fun(int r,int b){
        int max=0;
        for(int i=1;(r>=0 && b>=0);i++){
            if(i%2==0){
                if(r-i >=0)
               { max++;
               r=r-i;}
                else
                return max;
            }
            else{
                if(b-i  >=0)
               { max++;
               b-=i;}
                else
                return max;
            }
        }
        return max;
    }
}