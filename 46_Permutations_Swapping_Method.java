import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        count(0, list, nums);
        return list;
    }

    static void count(int idx, List<List<Integer>> list, int[] nums) {
        if (idx == nums.length) {
            List<Integer> sub = new ArrayList<>();
            for (int i : nums) {
                sub.add(i);
            }
            list.add(sub);
            return;
        }

        for (int i = idx; i < nums.length; i++) {

            swap(i, idx, nums);
            count(idx + 1, list, nums);
            swap(i, idx, nums);

        }
    }

    static void swap(int i, int j, int[] nums) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

}