
class Solution {
    public int sumSubseqWidths(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }

        Arrays.sort(nums);
        int n = nums.length;
        final long mod = (long) 1e9 + 7;

        long[] pow = new long[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (pow[i - 1] * 2) % mod;
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            long contribution = (pow[i] - pow[n - i - 1]) % mod;
            contribution = (contribution * nums[i]) % mod;
            sum = (sum + contribution) % mod;
        }

        if (sum < 0) {
            sum += mod;
        }

        return (int) sum;
    }
}
