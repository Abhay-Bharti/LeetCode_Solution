class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int n = rectangles.length, maxLen = Integer.MIN_VALUE;

        int[] len = new int[n];
        for(int i = 0; i<n; i++){
            len[i] = Math.min(rectangles[i][0], rectangles[i][1]);
            maxLen = Math.max(maxLen, len[i]);
        }

        int count = 0;
        for(int i = 0; i<n; i++){
            if(len[i] == maxLen) count++;
        }

        return count;
    }
}