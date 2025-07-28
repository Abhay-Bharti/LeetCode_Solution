class Solution {
    private int max = Integer.MIN_VALUE;
    private int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        subset(0, nums, 0);
        return count;
    }

    private void subset(int i, int[] nums, int temp) {
        if (i == nums.length) {
            return;
        }
        int prev = temp;

        temp = temp | nums[i];
        if (temp > max) {
            max = temp;
            count = 1;
        } else if (temp == max) {
            count++;
        }

        subset(i + 1, nums, temp);
        temp = prev;
        subset(i + 1, nums, temp);
    }
}