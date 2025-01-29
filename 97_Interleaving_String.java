class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        return helper(s1, s2, s3, 0, 0, 0, new HashMap<String, Boolean>());
    }

    static boolean helper(String s1, String s2, String s3, int i, int j, int k, HashMap<String, Boolean> dp) {
        if (i >= s1.length() && j >= s2.length())
            return k >= s3.length();

        String key = i + "," + j;
        if (dp.containsKey(key)) {
            return dp.get(key);
        }
        boolean a = false, b = false;

        if (i < s1.length() && s1.charAt(i) == s3.charAt(k))
            a = helper(s1, s2, s3, i + 1, j, k + 1, dp);
        if (j < s2.length() && s2.charAt(j) == s3.charAt(k))
            b = helper(s1, s2, s3, i, j + 1, k + 1, dp);

        dp.put(key, (a || b));
        return a || b;
    }
}