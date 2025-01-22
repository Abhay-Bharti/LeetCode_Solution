class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        Arrays.sort(candidates);
        count(0, candidates, target, list, sub);
        return list;
    }

    static void count(int idx, int[] arr, int tar, List<List<Integer>> list, List<Integer> sub) {
        if (tar == 0) {
            list.add(new ArrayList<>(sub));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > tar)
                break;
            sub.add(arr[i]);
            count(i + 1, arr, tar - arr[i], list, sub);
            sub.remove(sub.size() - 1);
        }
    }
}
