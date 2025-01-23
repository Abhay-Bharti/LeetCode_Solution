class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int[] count = { 0 }, sum = { 0 };
        count(0, nums, target, count, sum);
        return count[0];
    }

    static void count(int idx, int[] nums, int target, int[] count, int[] sum) {
        if (idx == nums.length) {
            if (sum[0] == target) {
                count[0]++;
            }
            return;
        }
        sum[0] += nums[idx];
        count(idx + 1, nums, target, count, sum);
        sum[0] -= 2 * nums[idx];
        count(idx + 1, nums, target, count, sum);
        sum[0] += nums[idx];
    }
}