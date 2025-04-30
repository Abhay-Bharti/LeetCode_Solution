class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, maxLen = 0, n = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                n++;
            }
            if (n > k) {
                if (nums[l] == 0) {
                    n--;
                }
                l++;
            }
            if (n <= k)
                maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }
}