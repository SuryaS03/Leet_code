class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int len = fb.length;
        int plant = 0;

        if (len == 1) {
            if (fb[0] == 0) {
                plant++;
            }
            return plant >= n;
        }

        if (fb[0] == 0 && fb[1] == 0) {
            plant++;
            fb[0] = 1;
        }
        for (int i = 1; i < len - 2; i++) {
            if (fb[i - 1] == 0 && fb[i + 1] == 0 && fb[i] == 0) {
                plant++;
                fb[i] = 1;
            }
        }
        if (fb[len - 1] == 0 && fb[len - 2] == 0) {
            plant++;
        }

        return plant >= n;
    }
}