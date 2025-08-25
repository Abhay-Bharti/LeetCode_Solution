class Solution {
    public int longestSubarray(int[] nums) {
        int len = 0, left = 0, zero = -1, right = -1;

        while (++right < nums.length) {
            if (nums[right] == 0) {
                left = zero + 1;
                zero = right;
            }
            len = Math.max(len, right - left);
        }

        return (zero == -1) ? nums.length - 1 : len;
    }
}