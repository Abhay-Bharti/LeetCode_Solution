class Solution {
    public boolean isMatch(String s, String p) {
        return helper(s, p, 0, 0, new HashMap<String, Boolean>());
    }

    static boolean helper(String s, String p, int i, int j, HashMap<String, Boolean> dp) {
        if (i >= s.length() && j >= p.length()) {
            return true;
        }
        String key = i + "," + j;
        if (dp.containsKey(key)) {
            return dp.get(key);
        }
        Boolean ans = false;
        if (i < s.length() && j < p.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'))
            ans = ans || helper(s, p, i + 1, j + 1, dp);
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            ans = ans || helper(s, p, i, j + 2, dp);
            int ind = i;
            while (ind < s.length() && (s.charAt(ind) == p.charAt(j) || p.charAt(j) == '.')) {
                ans = ans || helper(s, p, ind + 1, j + 2, dp);
                ind++;
            }
        }
        dp.put(key, ans);
        return ans;

    }
}