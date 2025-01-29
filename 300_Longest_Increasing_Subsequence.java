class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length + 1][nums.length + 1];
        return helper(0, 0, nums, dp);
    }

    static int helper(int ind, int prev, int[] nums, int[][] dp) {
        if (ind >= nums.length) {
            return 0;
        }

        if (dp[ind][prev] != 0) {
            return dp[ind][prev];
        }

        int b = 0;
        int a = helper(ind + 1, prev, nums, dp);
        if (prev == 0 || nums[ind] > nums[prev - 1]) {
            b = 1 + helper(ind + 1, ind + 1, nums, dp);
        }
        return dp[ind][prev] = Math.max(a, b);

    }
}