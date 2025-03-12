class Solution {
    public int maximumCount(int[] nums) {
        int s = 0, e = nums.length - 1, x = -1, y = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == 0) {
                int a = mid;
                while (mid >= 0 && nums[mid] == 0) {
                    x = mid;
                    mid--;
                }
                while (a < nums.length && nums[a] == 0) {
                    y = a;
                    a++;
                }
                break;
            }
            if (nums[mid] < 0) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        if (x != -1 && y != -1) {
            return Math.max(x, nums.length - y - 1);
        }
        return Math.max(e + 1, nums.length - (e + 1));
    }
}