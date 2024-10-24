class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0, lp = 0, rp = height.length - 1;
        while (lp < rp) {
            int ht = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int currwater = ht * width;
            maxWater = Math.max(maxWater, currwater);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
}