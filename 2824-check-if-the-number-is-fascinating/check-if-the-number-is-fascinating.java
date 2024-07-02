class Solution {
    public boolean isFascinating(int n) {
        String s="";
        int n2=n*2;
        int n3=n*3;
        s=s+n+n2+n3;
        
        char ch[]={'1','2','3','4','5','6','7','8','9'};
        char dig[]=s.toCharArray();
        Arrays.sort(dig);
        return Arrays.equals(ch,dig);
        
    }
}