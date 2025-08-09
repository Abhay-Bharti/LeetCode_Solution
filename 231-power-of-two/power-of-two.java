class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if (n % 2 != 0) return false;

        long ans = 1;
        while (ans<<1 <= n) {
            ans = ans << 1;
        }
        return (int) ans == n;
    }
}