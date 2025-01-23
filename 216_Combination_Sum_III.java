class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        int[] sum = { 0 };

        count(list, sub, k, n, sum, 1);
        return list;
    }

    static void count(List<List<Integer>> list, List<Integer> sub, int k, int n, int[] sum, int idx) {
        if (sub.size() == k && sum[0] == n) {
            list.add(new ArrayList<>(sub));
            return;
        }

        for (int i = idx; i < 10; i++) {
            sub.add(i);
            if (sum[0] + i <= n) {
                sum[0] += i;
                count(list, sub, k, n, sum, i + 1);
                sum[0] -= i;
            }
            sub.remove(sub.size() - 1);
        }
    }
}