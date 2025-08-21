class Solution {
    private long mod = 1000000007L;

    public int countGoodNumbers(long n) {
        if (n == 1)
            return 5;
        return (int) (pow(4, n / 2) * pow(5, (n / 2 + n % 2)) % mod);
    }

    private long pow(long base, long exp) {
        long b = 1;
        long A = base;
        if ((exp & 1) == 1) {
            b = base % mod;
        }
        exp = (exp >> 1);
        while (exp > 0) {
            A = (A * A) % mod;
            if ((exp & 1) == 1) {
                b = (A * b) % mod;
            }
            exp = (exp >> 1);
        }

        return b % mod;
    }

}