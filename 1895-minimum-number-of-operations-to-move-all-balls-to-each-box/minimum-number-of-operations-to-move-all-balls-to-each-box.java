class Solution {
    public int[] minOperations(String boxes) {
        
        char ch[]=boxes.toCharArray();
        int res[]=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            int sum=0;
            for(int j=0;j<ch.length;j++){
                if(i!=j){
                    if(ch[j]=='1'){
                        sum+=Math.abs(i-j);

                    }
                }
            }
            res[i]=sum;

        }
        return res;
        
    }
}