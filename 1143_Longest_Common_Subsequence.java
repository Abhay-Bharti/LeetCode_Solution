class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        return helper(text1.length() - 1, text2.length() - 1, text1, text2, dp);
    }

    static int helper(int i, int j, String s, String t, int[][] dp) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s.charAt(i) == t.charAt(j)) {
            dp[i][j] = 1 + helper(i - 1, j - 1, s, t, dp);
        } else {
            dp[i][j] = Math.max(helper(i - 1, j, s, t, dp), helper(i, j - 1, s, t, dp));
        }
        return dp[i][j];
    }
}