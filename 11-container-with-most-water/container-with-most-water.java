class Solution {
    public int maxArea(int[] height) {
        int s = 0, e = height.length-1, water = 0;

        while(s < e){
            int w = Math.min(height[s], height[e]) * (e-s);
            water = Math.max(water, w);

            if(height[s] <= height[e]){
                s++;
            }else{
                e--;
            }
        }

        return water;
    }
}