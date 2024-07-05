class Solution {
    public int minimumPushes(String word) {
        int[] alpha = new int[26];
        
        for(char ch:word.toCharArray()) {
            alpha[ch - 'a']++;
        }
        
        Arrays.sort(alpha);
        
        int ans = 0;
        
        for(int i = 25; i >= 0; i--) {
            if(alpha[i] == 0) break;
            
            if(i >= 18) ans += alpha[i];
            else if(i >= 10) ans += alpha[i] * 2;
            else if(i >= 2) ans += alpha[i] * 3;
            else ans += alpha[i] * 4;
        }
        
        return ans;
    }
}