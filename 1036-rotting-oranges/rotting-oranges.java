class Solution {
    class Pair {
        int r;
        int c;

        public Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j));
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) {
            return 0;
        }

        int time = -1;
        int[] dr = { -1, 0, 1, 0 };
        int[] dc = { 0, 1, 0, -1 };

        while (!q.isEmpty()) {
            int size = q.size();

            for (int k = 0; k < size; k++) {
                Pair curr = q.poll();

                for (int i = 0; i < 4; i++) {
                    int nr = dr[i] + curr.r;
                    int nc = dc[i] + curr.c;

                    if (nr >= 0 && nc >= 0 && nr < n && nc < m && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        fresh--;
                        q.add(new Pair(nr, nc));
                    }
                }
            }
            time++;
        }

        return (fresh == 0) ? time : -1;
    }
}