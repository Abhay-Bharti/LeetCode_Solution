class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];

        for(int j = 0; j<m; j++){
            if(!vis[0][j] && grid[0][j] == 1){
                dfs(grid, vis, 0, j);
            }
            if(!vis[n-1][j] && grid[n-1][j] == 1){
                dfs(grid, vis, n-1, j);
            }
        }

        for(int i = 1; i<n-1; i++){
            if(!vis[i][0] && grid[i][0] == 1){
                dfs(grid, vis, i, 0);
            }
            if(!vis[i][m-1] && grid[i][m-1] == 1){
                dfs(grid, vis, i, m-1);
            }
        }

        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(int[][] grid, boolean[][] vis, int r, int c){
        vis[r][c] = true;

        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, -1, 0, 1};

        for(int i = 0; i<4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && !vis[nr][nc] && grid[nr][nc] == 1){
                dfs(grid, vis, nr, nc);
            }
        }
    }
}