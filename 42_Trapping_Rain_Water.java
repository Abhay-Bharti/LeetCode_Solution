class Solution {
    public int trap(int[] height) {
        int n = height.length, volume = 0;

        int[] lm = new int[n];
        lm[0] = height[0];
        for(int i = 1; i<n; i++){
            lm[i] = Math.max(height[i], lm[i-1]);
        }

        int[] rm = new int[n];
        rm[n-1] = height[n-1];
        for(int i = (n-2); i>=0; i-- ){
            rm[i] = Math.max(height[i], rm[i+1]);
        }

        for(int i = 0; i<n; i++ ){
            int w = Math.min(rm[i], lm[i]);
            int tw = w - height[i];

            if(tw>0){
                volume += tw;
            }
        }

        return volume;
    }
}