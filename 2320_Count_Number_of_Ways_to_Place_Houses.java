class Solution {
    static final long mod = (long) 1e9 + 7;

    public int countHousePlacements(int n) {
        long[] dp = new long[n + 1];
        long ways = count(n, dp);
        long ans = ways * ways % mod;
        return (int) ans;
    }

    static long count(int n, long[] dp) {
        if (n == 1) {
            return 2;
        }

        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i <= n; i++) {
            dp[i] = (long) (dp[i - 1] + dp[i - 2]) % mod;
        }

        return dp[n];
    }
}