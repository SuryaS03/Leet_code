import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {
       BigInteger b1=new BigInteger(num1);
       BigInteger b2=new BigInteger(num2);
       BigInteger sum=b1.add(b2);
       String s=sum.toString();
       return s;

        
    }
}