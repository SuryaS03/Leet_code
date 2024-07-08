class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String str="";
        for(String s2:words){
            str+=s2.charAt(0);
        }
        return str.equals(s);

    }
}