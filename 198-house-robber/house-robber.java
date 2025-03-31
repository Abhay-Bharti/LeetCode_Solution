class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }

    public int helper(int[] nums, int i, int[] dp){
        if(i >= nums.length){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int b = helper(nums, i+1, dp);
        int a = nums[i] + helper(nums, i+2, dp);

        return dp[i] = Math.max(a, b);
    }
}