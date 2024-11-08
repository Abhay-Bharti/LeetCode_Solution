class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int b = nums.length / 2;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                count++;
                if (count > b) {
                    return nums[i - 1];
                }
                count = 0;
            }
        }
        return nums[nums.length - 1];
    }
}