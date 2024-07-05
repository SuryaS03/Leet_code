class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        int vow = 0;
        int con = 0;
        for(char c : word.toCharArray()){
            if(c == '@' || c == '#' || c == '$') return false;
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vow++;
            }else {
                if((c > 'a' && c <= 'z') || (c > 'A' && c <= 'Z')) con++;
            }
            
        }
        return vow > 0 && con > 0;
    }
}