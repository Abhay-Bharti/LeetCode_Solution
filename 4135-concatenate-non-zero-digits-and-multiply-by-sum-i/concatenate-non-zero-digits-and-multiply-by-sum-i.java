class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        int count = (n == 0) ? 1 : (int) Math.log10(Math.abs(n)) + 1;
        long pow = (long) Math.pow(10, count-1);

        while (n > 0) {
            long a = n / pow;
            if (a == 0) {
                n %= pow;
                pow /= 10;
                continue;
            }
            x = a + x * 10;
            sum += a;
            n %= pow;
            pow /= 10;
        }

        return sum * x;
    }
}