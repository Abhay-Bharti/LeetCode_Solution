class Solution {
    public int maxSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int sum = 0, minSum = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                if (nums[i] > 0) {
                    sum += nums[i];
                    set.add(nums[i]);
                } else {
                    minSum = Math.max(minSum, nums[i]);
                    set.add(nums[i]);
                }
            }
        }

        return sum == 0 ? minSum : sum;
    }
}