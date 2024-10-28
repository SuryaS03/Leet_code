class Solution {
    public static int help(int[][] brd, int r, int c) {
    int cnt = 0;
    int m=brd.length;
    int n=brd[0].length;
    int[] dRow = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] dCol = {-1, 0, 1, -1, 1, -1, 0, 1};

    for (int i = 0; i < 8; i++) {
        int newRow = r + dRow[i];
        int newCol = c + dCol[i];
        if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {
            if (brd[newRow][newCol] == 1 || brd[newRow][newCol] == 3) {
                cnt++;
            }
        }
    }
    return cnt;
}

    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int count = help(board, i, j);

                if(board[i][j] == 0){
                    if(count == 3){
                        board[i][j] = 2; 
                    }
                }
                else if(board[i][j] == 1){
                    if(count < 2 || count > 3)board[i][j] = 3; 
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 2)board[i][j] = 1;
                else if(board[i][j] == 3)board[i][j] = 0;
            }
        }
    }
}