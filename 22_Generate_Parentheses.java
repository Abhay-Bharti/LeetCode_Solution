class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        count(n, n, list, new StringBuilder());
        return list;
    }

    static void count(int open, int close, List<String> list, StringBuilder s) {
        if (open == 0 && close == 0) {
            list.add(s.toString());
            return;
        }

        if (open > 0) {
            s.append("(");
            count(open - 1, close, list, s);
            s.deleteCharAt(s.length() - 1);
        }
        if (close > open) {
            s.append(")");
            count(open, close - 1, list, s);
            s.deleteCharAt(s.length() - 1);
        }
    }
}