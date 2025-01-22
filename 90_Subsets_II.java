class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        Arrays.sort(nums);
        count(0, nums, list, sub);

        return list;
    }

    static void count(int idx, int[] nums, List<List<Integer>> list, List<Integer> sub) {
        list.add(new ArrayList<>(sub));
        for (int i = idx; i < nums.length; i++) {
            if (idx != i && nums[i] == nums[i - 1])
                continue;
            sub.add(nums[i]);
            count(i + 1, nums, list, sub);
            sub.remove(sub.size() - 1);
        }
    }
}