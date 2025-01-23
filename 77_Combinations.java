class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        comb(n, k, list, sub, 1);

        return list;
    }

    static void comb(int n, int k, List<List<Integer>> list, List<Integer> sub, int idx) {
        if (sub.size() == k) {
            list.add(new ArrayList<>(sub));
            return;
        }

        for (int i = idx; i <= n; i++) {
            sub.add(i);
            comb(n, k, list, sub, i + 1);
            sub.remove(sub.size() - 1);
        }
    }
}