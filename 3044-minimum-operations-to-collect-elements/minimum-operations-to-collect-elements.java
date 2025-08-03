class Solution {
    public int minOperations(List<Integer> nums, int k) {
        boolean[] collection = new boolean[k];
        int s = 0;

        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) <= k) {
                collection[nums.get(i) - 1] = true;
                while (s < collection.length && collection[s]) {
                    s++;
                }
                if (s == k) {
                    return nums.size() - i;
                }
            }
        }

        return 0;
    }
}