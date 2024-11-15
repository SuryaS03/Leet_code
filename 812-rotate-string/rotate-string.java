class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal))
        return true;
        int n=s.length();
        for(int i=1;i<s.length();i++){
            char ch[]=s.toCharArray();
            char ch1[]=new char [n];

            for(int j=0;j<ch.length;j++){
                ch1[j]=ch[(i+j)%n];
            }
           if(String.valueOf(ch1).equals(goal))
           return true;
        }
        return false;
        
    }
}