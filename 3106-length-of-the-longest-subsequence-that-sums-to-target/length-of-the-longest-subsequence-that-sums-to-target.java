class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[] dp = new int[target + 1];

        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i : nums) {
            for (int t = target; t >= i; t--) {
                if (dp[t - i] != -1) {
                    dp[t] = Math.max(dp[t], dp[t - i] + 1);
                }
            }
        }

        return dp[target] == -1 ? -1 : dp[target];
    }
}