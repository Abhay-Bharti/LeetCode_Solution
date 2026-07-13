class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        int llen = String.valueOf(low).length();
        int hlen = String.valueOf(high).length();

        int tmp = 0, pow = (int)Math.pow(10, llen-1);

        for (int i = llen; i <= hlen; i++) {

            // Intitalize first digit
            int t = 1;
            for (int k = 1; k <= pow; k *= 10) {
                tmp = tmp * 10 + t;
                t++;
            }
            if(tmp >= low &&tmp <= high)
                res.add(tmp);

            // Remove first digit and append next digit
            for (int j = t; j <= 9; j++) {
                tmp %= pow;
                tmp = tmp * 10 + j;
                System.out.printf("i = %d, pow = %d, tmp = %d, j = %d\n", i, pow, tmp, j);
                if (tmp > high) {
                    break;
                } else {
                    if (tmp >= low) {
                        res.add(tmp);
                    }
                }
                
            }

            // Reset tmp
            tmp = 0;
            pow *= 10;
        }

        return res;
    }
}