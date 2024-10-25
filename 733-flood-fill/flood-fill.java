class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int pc = image[sr][sc];
        if (pc != color) { 
            solve(image, sr, sc, color, pc);
        }
        return image;
    }

    public static void solve(int[][] mat, int sr, int sc, int nc, int pc) {
        if (sr < 0 || sr >= mat.length || sc < 0 || sc >= mat[0].length || mat[sr][sc] != pc) {
            return;
        }
        mat[sr][sc] = nc;
        solve(mat, sr - 1, sc, nc, pc); // up
        solve(mat, sr + 1, sc, nc, pc); // down
        solve(mat, sr, sc - 1, nc, pc); // left
        solve(mat, sr, sc + 1, nc, pc); // right
    }
}
