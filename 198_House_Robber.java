class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(0, nums, dp);

    }

    static int helper(int idx, int[] nums, int[] dp) {
        if (idx >= nums.length) {
            return 0;
        }
        if (dp[idx] != -1)
            return dp[idx];
        int a = helper(idx + 1, nums, dp);
        int b = nums[idx] + helper(idx + 2, nums, dp);
        return dp[idx] = Math.max(a, b);
    }
}