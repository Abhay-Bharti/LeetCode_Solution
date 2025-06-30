class Solution {

    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                count++;
                dfs(isConnected, visited, i);
            }
        }
        return count;
    }

    private void dfs(int[][] arr, boolean[] visited, int s) {
        visited[s] = true;

        for (int i = 0; i < arr[s].length; i++) {
            if (arr[s][i] == 1 && !visited[i]) {
                dfs(arr, visited, i);
            }
        }

    }
}