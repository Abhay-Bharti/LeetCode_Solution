class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len; // This handles cases where k is greater than the length of the array

        if (len != 1 && k != 0) {
            int[] arr = new int[k];
            int j = 0;

            // Copy the last k elements to arr
            for (int i = len - k; i < len; i++) {
                arr[j] = nums[i];
                j++;
            }

            // Shift the first part of the array to the right
            for (int i = len - k - 1; i >= 0; i--) {
                nums[i + k] = nums[i];
            }

            // Copy the elements from arr to the beginning of nums
            for (int i = 0; i < k; i++) {
                nums[i] = arr[i];
            }
        }
    }
}
