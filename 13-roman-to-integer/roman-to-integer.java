class Solution {
    public int romanToInt(String s) {
        int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String st[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < val.length; i++)
            hm.put(st[i], val[i]);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            
            if (i < s.length() - 1 && hm.containsKey(s.substring(i, i + 2))) {
                res += hm.get(s.substring(i, i + 2));
                i++; 
            } else {
                
                res += hm.get("" + s.charAt(i));
            }
        }
        return res;
    }
}
