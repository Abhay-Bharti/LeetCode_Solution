class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0, temp = 0, l = 0;

        for (int r = 0; r < nums.length; r++) {
            if (!set.contains(nums[r])) {
                set.add(nums[r]);
                temp += nums[r];
                max = temp > max ? temp : max;
            } else {
                while (l <= r && nums[l] != nums[r]) {
                    set.remove(nums[l]);
                    temp -= nums[l];
                    l++;
                }
                l++;
            }
        }

        return max;
    }
}