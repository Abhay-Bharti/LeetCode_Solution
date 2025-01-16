class Solution {
    public String smallestGoodBase(String n) {
        long num = Long.parseLong(n);

        for (int m = 63; m >= 2; m--) {
            long low = 2, high = (long) Math.pow(num, 1.0 / (m - 1)) + 1;

            while (low <= high) {
                long mid = low + (high - low) / 2;
                long val = 0, mul = 1;

                for (int j = 0; j < m; j++) {
                    val += mul;
                    if (val > num)
                        break;
                    mul *= mid;
                    if (mul > num)
                        break;
                }

                if (val == num) {
                    return String.valueOf(mid);
                }
                if (val < num) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return String.valueOf(num - 1);
    }
}
