class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return n;
        }
        int minIdx = -1, maxIdx = -1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (min > nums[i]) {
                min = nums[i];
                minIdx = i;
            }
            if (max < nums[i]) {
                max = nums[i];
                maxIdx = i;
            }
        }

        int start = minIdx < maxIdx ? maxIdx + 1 : minIdx + 1;
        int end = n - minIdx < n - maxIdx ? n - maxIdx : n - minIdx;
        int between = minIdx < maxIdx ? minIdx + 1 + (n - maxIdx) : maxIdx + 1 + (n - minIdx);

        return Math.min(start, Math.min(end, between));
    }
}