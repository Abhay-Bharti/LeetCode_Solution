class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        count(0, nums, list);
        return list;
    }

    static void count(int idx, int[] nums, List<List<Integer>> list) {
        if (idx == nums.length) {
            List<Integer> sub = new ArrayList<>();
            for (int i : nums) {
                sub.add(i);
            }
            list.add(sub);
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = idx; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                swap(i, idx, nums);
                count(idx + 1, nums, list);
                swap(i, idx, nums);
                set.add(nums[i]);
            }
        }
    }

    static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}