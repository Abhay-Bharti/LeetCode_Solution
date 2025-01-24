class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int b = nums.length / 3;
        List<Integer> list = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                if (count >= b) {
                    list.add(nums[i]);
                }
                count = 0;
            }
        }
        if (count >= b) {
            list.add(nums[nums.length - 1]);
        }

        return list;
    }
}