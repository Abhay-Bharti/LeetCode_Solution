class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = 1000000007;
        int n = nums.length;
        int[] power = new int[n];
        power[0] = 1;

        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }

        int s = 0, e = n - 1, count = 0;

        while (s <= e) {
            if (nums[s] + nums[e] <= target) {
                count = (count + power[e - s]) % mod;
                s++;
            } else {
                e--;
            }
        }

        return count;
    }
}
