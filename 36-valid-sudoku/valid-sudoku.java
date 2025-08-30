class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                for (int k = i + 1; k < 9; k++) {
                    if (board[k][j] == board[i][j])
                        return false;
                }
                for (int k = j + 1; k < 9; k++) {
                    if (board[i][k] == board[i][j])
                        return false;
                }

                int r = i / 3 * 3, c = j / 3 * 3;

                for (int m = r; m < r + 3; m++) {
                    for (int n = c; n < c + 3; n++) {
                        if (i != m && j != n && board[m][n] == board[i][j]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}