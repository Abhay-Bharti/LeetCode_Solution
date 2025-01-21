class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        count(0, nums, list, arr);
        return list;
    }

    static void count(int idx, int[] nums, List<List<Integer>> list, List<Integer> arr) {

        if (idx >= nums.length) {
            list.add(new ArrayList<>(arr));
            return;
        }

        arr.add(nums[idx]);
        count(idx + 1, nums, list, arr);
        arr.remove(arr.size() - 1);
        count(idx + 1, nums, list, arr);
    }

}