class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> f = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                f.add(i);
            }
        }
        if (k > f.size()) {
            return -1;
        } else {
            return f.get(k - 1);
        }
    }
}