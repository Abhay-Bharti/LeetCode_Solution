class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] col = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (col[i] == 0) {
                q.add(i);
                col[i] = 1;
            }
            while (!q.isEmpty()) {
                int curr = q.remove();
                for (int j = 0; j < graph[curr].length; j++) {
                    int nxt = graph[curr][j];

                    if (col[nxt] == 0) {
                        int nxtCol = col[curr] == 1 ? 2 : 1;
                        col[nxt] = nxtCol;
                        q.add(nxt);
                    } else if (col[curr] == col[nxt]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}