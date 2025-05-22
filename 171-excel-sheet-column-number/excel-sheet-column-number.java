class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0, pow = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            char ch = columnTitle.charAt(i);
            ans += Math.pow(26, pow) * (ch - 'A' + 1);
            pow++;
        }
        return ans;
    }
}