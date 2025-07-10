class Solution {
    public class Pair{
        int r;
        int c;

        public Pair(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    public int[] dr = {-1, 1, 0, 0};
    public int[] dc = {0, 0, -1, 1};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initial = image[sr][sc];
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr, sc));

        while(!q.isEmpty()){
            Pair curr = q.poll();
            image[curr.r][curr.c] = color;

            for(int i = 0; i<4; i++){
                int nr = curr.r + dr[i];
                int nc = curr.c + dc[i];

                if(nr >= 0 && nc >= 0 && nr < image.length && nc < image[0].length && image[nr][nc] == initial && image[nr][nc] != color)
                q.add(new Pair(nr, nc));
            }
        }

        return image;
    }
}