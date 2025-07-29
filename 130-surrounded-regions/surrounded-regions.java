class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        boolean[][] vis = new boolean[n][m];

        for(int j = 0; j<m; j++){
            if(!vis[0][j] && board[0][j] == 'O'){
                dfs(board, vis, 0, j);
            }
            if(!vis[n-1][j] && board[n-1][j] == 'O'){
                dfs(board, vis, n-1, j);
            }            
        }

        for(int i = 1; i<n-1; i++){
            if(!vis[i][0] && board[i][0] == 'O'){
                dfs(board, vis, i, 0);
            }
            if(!vis[i][m-1] && board[i][m-1] == 'O'){
                dfs(board, vis, i, m-1);
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(board[i][j] == 'O' && !vis[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(char[][] board, boolean[][] vis, int r, int c){
        vis[r][c] = true;

        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, -1, 0, 1};

        for(int i = 0; i<4; i++){
            int nr = dr[i] + r;
            int nc = dc[i] + c;

            if(nr >= 0 && nc >= 0 && nr < board.length && nc < board[0].length && !vis[nr][nc] && board[nr][nc] == 'O'){
                dfs(board, vis, nr, nc);
            }
        }
    }
}