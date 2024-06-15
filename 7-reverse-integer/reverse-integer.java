class Solution {
    public int reverse(int x) {
        int rev=0;
        int ans=0;
        int flag=0;
        if(x<0){
            x=x*-1;
            flag=1;
        }
        
        while(x>0){
            
            int dig=x%10;
            rev=ans*10+dig;
            if((rev-dig)/10!=ans)
            return 0;
            x/=10;
            ans=rev;
        }
        if(flag==0)
        return rev;
        else
        return rev*-1;
        }
        
    
}