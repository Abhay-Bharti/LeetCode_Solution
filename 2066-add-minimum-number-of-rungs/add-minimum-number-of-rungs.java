class Solution {
    public int addRungs(int[] rungs, int dist) {
        int count = 0, j = 0;

        while ((j + dist) < rungs[0]) {
            count++;
            j += dist;
        }

        for (int i = 0; i < rungs.length - 1; i++) {
            if (rungs[i + 1] - rungs[i] > dist) {
                count += (rungs[i + 1] - rungs[i] - 1) / dist;
            }
        }

        return count;
    }
}