class Solution {
    public int reverse(int x) {
        int res = 0;
        int original = x;
        x = Math.abs(x);
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            
            res = res * 10 + digit;
        }
        
        return original < 0 ? -res : res;
    }
}
