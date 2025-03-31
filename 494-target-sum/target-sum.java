class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int[] count = { 0 };
        count(0, nums, target, count, 0);
        return count[0];
    }

    static void count(int idx, int[] nums, int target, int[] count, int sum) {
        if (idx == nums.length) {
            if (sum == target) {
                count[0]++;
            }
            return;
        }
        count(idx + 1, nums, target, count, sum+nums[idx]);
        count(idx + 1, nums, target, count, sum-nums[idx]);
    }
}