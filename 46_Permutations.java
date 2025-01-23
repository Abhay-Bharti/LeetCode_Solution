class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        Boolean[] flag = new Boolean[nums.length];
        Arrays.fill(flag, false);
        count(list, sub, nums, flag);
        return list;
    }

    static void count(List<List<Integer>> list, List<Integer> sub, int[] nums, Boolean[] flag) {
        if (sub.size() == nums.length) {
            list.add(new ArrayList<>(sub));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (flag[i] == false) {
                sub.add(nums[i]);
                flag[i] = true;
                count(list, sub, nums, flag);
                flag[i] = false;
                sub.remove(sub.size() - 1);
            }
        }
    }

}