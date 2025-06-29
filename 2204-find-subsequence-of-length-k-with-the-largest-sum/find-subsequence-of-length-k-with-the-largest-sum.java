class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));
        int[][] sum = Arrays.copyOfRange(arr, 0, k);

        Arrays.sort(sum, Comparator.comparingInt(o -> o[1]));
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = sum[i][0];
        }

        return res;
    }
}