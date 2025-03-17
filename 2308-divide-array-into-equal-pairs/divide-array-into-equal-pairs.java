class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length / 2);
        int n = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) % 2 == 0) {
                n += map.get(nums[i]) / 2;
                map.put(nums[i], 0);
            }
        }
        // for (int i : map.keySet()) {
        //     if (map.get(i) % 2 == 0) {
        //         n += map.get(i) / 2;

        //         System.out.println(n);
        //     } else {
        //         System.out.println("Me");
        //         return false;
        //     }
        // }
        //         System.out.println(map);

        return n == (nums.length / 2);
    }
}