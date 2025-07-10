class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int count = 0;

        for (int i = 0; i < vis.length; i++) {
            for (int j = 0; j < vis[0].length; j++) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    count++;
                    dfs(i, j, grid, vis);
                }
            }
        }

        return count;
    }

    private void dfs(int r, int c, char[][] grid, boolean[][] vis) {
        vis[r][c] = true;

        if(r-1 >= 0 && grid[r-1][c] == '1' && !vis[r-1][c]){
            dfs(r-1, c, grid, vis);
        }
        if(c-1 >= 0 && grid[r][c-1] == '1' && !vis[r][c-1]){
            dfs(r, c-1, grid, vis);
        }
        if(r+1 < grid.length && grid[r+1][c] == '1' && !vis[r+1][c]){
            dfs(r+1, c, grid, vis);
        }
        if(c+1 < grid[0].length && grid[r][c+1] == '1' && !vis[r][c+1]){
            dfs(r, c+1, grid, vis);
        }
    }
}