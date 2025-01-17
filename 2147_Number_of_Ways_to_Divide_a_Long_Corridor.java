class Solution {
    public int numberOfWays(String corridor) {
        if (corridor.length() <= 1) {
            return 0;
        }

        int seatCount = 0, currentSeat = 0, sum = 0;
        long ans = 1;
        final int MOD = 1000000007;

        for (int i = 0; i < corridor.length(); i++) {
            char ch = corridor.charAt(i);

            if (ch == 'S') {
                seatCount++;
                sum++;

                if (seatCount == 2) {
                    currentSeat = i;
                } else if (seatCount == 3) {
                    ans = (ans * (i - currentSeat)) % MOD;
                    currentSeat = i;
                    seatCount = 1;
                }
            }
        }

        return sum % 2 == 0 && sum > 0 ? (int) ans : 0;
    }
}
