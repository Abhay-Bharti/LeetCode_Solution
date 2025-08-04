class Solution {
    public int subsetXORSum(int[] nums) {
        int[] sum = { 0 };
        helper(nums, 0, sum, 0, 0);
        return sum[0];
    }

    public void helper(int[] nums, int i, int[] sum, int xor1, int xor2) {
        if (i == nums.length) {
            sum[0] += xor2;
            return;
        }

        helper(nums, i + 1, sum, xor1 ^ nums[i], xor2);
        helper(nums, i + 1, sum, xor1, xor2 ^ nums[i]);
    }
}