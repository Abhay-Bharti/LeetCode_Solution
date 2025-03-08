class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') {
                count++;
            }
            if (i - k >= 0 && blocks.charAt(i - k) == 'W') {
                count--;
            }
            if (i >= k - 1) {
                ans = Math.min(ans, count);
            }
        }
        return ans;
    }
}