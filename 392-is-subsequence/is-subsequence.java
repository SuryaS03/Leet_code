class Solution {
    public boolean isSubsequence(String s, String t) {

        int idx = 0;
        int count = 0;
        char sent[] = t.toCharArray();
        char key[] = s.toCharArray();
       
        for (int i = 0; i < key.length; i++) {
            char ke = key[i];
            for (int j = idx; j < sent.length; j++) {
                if (ke == sent[j]) {
                    idx = j+1;
                    count++;
                    break;
                }

            }
        }

        if (count == s.length())
            return true;
        return false;
    }
}