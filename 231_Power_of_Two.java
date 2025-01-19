class Solution {
    public boolean isPowerOfTwo(int n) {
        long ans = 1;
        while (ans * 2 <= n) {
            ans *= 2;
        }
        return (int) ans == n;
    }
}