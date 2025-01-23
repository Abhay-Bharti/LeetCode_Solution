class Solution {

    public int totalNQueens(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2 || n == 3) {
            return 0;
        }

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        int[] count = { 0 };
        nQueens(board, 0, count);

        return count[0];
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static void nQueens(char[][] board, int row, int[] count) {
        if (row == board.length) {
            count[0]++;
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1, count);
                board[row][j] = '.';
            }
        }
    }
}