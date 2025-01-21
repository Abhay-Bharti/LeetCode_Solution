class Solution {
    public int findTheWinner(int n, int k) {
        int res = count(n, k);
        return res;
    }

    static int count(int n, int k) {
        if (n == 1) {
            return n;
        }

        int ans = (count(n - 1, k) + k) % n;
        return ans == 0 ? n : ans;
    }
}