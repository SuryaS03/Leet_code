class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String value = String.valueOf(board[i][j]);
                    if (!seen.add(value + " in row " + i) ||
                        !seen.add(value + " in col " + j) ||
                        !seen.add(value + " in block " + i / 3 + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
