class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder res = new StringBuilder();
        int count = 0;

        // Process the string from the end to the beginning
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c != '-') {
                if (count == k) {
                    res.append('-');
                    count = 0;
                }
                if (Character.isAlphabetic(c)) {
                    res.append(Character.toUpperCase(c));
                } else {
                    res.append(c);
                }
                count++;
            }
        }

        return res.reverse().toString();
    }
}
