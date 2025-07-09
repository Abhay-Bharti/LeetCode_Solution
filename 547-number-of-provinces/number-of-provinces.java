class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] vis = new boolean[isConnected.length];
        int count = 0;

        for(int i = 0; i < vis.length; i++){
            if(!vis[i]){
                dfs(i, vis, isConnected);
                count++;
            }
        }

        return count;
    }

    private void dfs(int i, boolean[] vis, int[][] isConnected){
        vis[i] = true;

        for(int j = 0; j<isConnected[i].length; j++){
            if(isConnected[i][j] == 1 && !vis[j]){
                dfs(j, vis, isConnected);
            }
        }
    }
}