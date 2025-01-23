class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] r : board) {
            Arrays.fill(r, '.');
        }

        List<List<String>> list = new ArrayList<>();
        nQueens(board, list, 0);
        return list;
    }

    static void nQueens(char[][] board, List<List<String>> list, int row) {
        if (row == board.length) {
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                String s = new String(board[i]);
                ans.add(s);
            }
            list.add(ans);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, list, row + 1);
                board[row][j] = '.';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }
}