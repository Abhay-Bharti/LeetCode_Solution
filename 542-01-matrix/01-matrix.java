class Solution {
    class Pair {
        int r;
        int c;

        public Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] res = new int[n][m];
        boolean[][] vis = new boolean[n][m];

        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    vis[i][j] = true;
                    res[i][j] = 0;
                    q.add(new Pair(i, j));
                }
            }
        }

        int[] dr = { -1, 0, 1, 0 };
        int[] dc = { 0, 1, 0, -1 };
        int dist = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Pair curr = q.remove();

                for (int j = 0; j < 4; j++) {
                    int nr = curr.r + dr[j];
                    int nc = curr.c + dc[j];

                    if (nr >= 0 && nc >= 0 && nr < n && nc < m && !vis[nr][nc] && mat[nr][nc] == 1) {
                        vis[nr][nc] = true;
                        res[nr][nc] = dist;
                        q.add(new Pair(nr, nc));
                    }
                }
            }
            dist++;
        }
        return res;
    }
}