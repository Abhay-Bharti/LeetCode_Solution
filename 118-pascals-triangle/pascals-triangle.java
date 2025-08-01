class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(Arrays.asList(1)));

        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add((res.get(i - 1).get(j - 1) + res.get(i - 1).get(j)));
                }
            }
            res.add(list);
        }

        return res;
    }
}