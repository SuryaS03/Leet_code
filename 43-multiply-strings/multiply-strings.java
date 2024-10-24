import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {

      BigInteger nu1=new BigInteger(num1);
      BigInteger nu2=new BigInteger(num2);
       BigInteger res=nu1.multiply(nu2);
        return res.toString();
    }
}