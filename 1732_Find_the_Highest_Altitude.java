class Solution {
    public int largestAltitude(int[] gain) {
        int h = 0;
        int max = 0;

        for(int i = 0; i<gain.length; i++ ){
            h += gain[i];
            max = Math.max(max, h);
        }
        return max;
    }
}