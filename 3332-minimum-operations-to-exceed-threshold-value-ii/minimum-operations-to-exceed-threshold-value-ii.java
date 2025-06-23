class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        boolean isValid = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                isValid = false;
            }
            pq.add((long)nums[i]);
        }

        if (isValid)
            return 0;

        int ans = 0;
        while (pq.peek() < (long)k) {
            long a = pq.remove();
            long b = pq.remove();

            pq.add((long)(a * 2 + b));
            ans++;
        }

        return ans;
    }
}