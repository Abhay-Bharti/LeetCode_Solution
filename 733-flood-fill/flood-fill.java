class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        helper(image, sr, sc, color, new boolean[image.length][image[0].length], image[sr][sc]);
        return image;
    }

    public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol){
            return;
        }

        vis[sr][sc] = true;
        image[sr][sc] = color;

        helper(image, sr, sc-1, color, vis, orgCol);
        helper(image, sr, sc+1, color, vis, orgCol);
        helper(image, sr-1, sc, color, vis, orgCol);
        helper(image, sr+1, sc, color, vis, orgCol);
    }

}