class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        count(0, candidates, target, list, sub, 0);
        return list;
    }

    static void count(int idx, int[] arr, int tar, List<List<Integer>> list, List<Integer> sub, int sum) {
        if (idx >= arr.length) {
            if (sum == tar) {
                list.add(new ArrayList<>(sub));
            }
            return;
        }

        count(idx + 1, arr, tar, list, sub, sum);

        if (sum + arr[idx] <= tar) {
            sub.add(arr[idx]);
            count(idx, arr, tar, list, sub, sum + arr[idx]);
            sub.remove(sub.size() - 1);
        }
    }
}
