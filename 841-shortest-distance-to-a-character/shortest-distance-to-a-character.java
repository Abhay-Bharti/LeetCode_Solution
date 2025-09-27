class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int prev = -n;  // Very far left
        
        // Pass 1: Distance from closest 'c' on the left
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = i - prev;
        }
        
        prev = 2 * n;  // Very far right
        // Pass 2: Distance from closest 'c' on the right
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = Math.min(ans[i], prev - i);
        }
        
        return ans;
    }
}
