class Solution {
    public int maxScore(String s) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < s.length(); i++) {
            String s1 = s.substring(0, i), s2 = s.substring(i);
            int c1 = 0, c2 = 0;
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == '0') {
                    c1++;
                }
            }
            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) == '1') {
                    c2++;
                }
            }
            max = Math.max(max, (c1 + c2));
        }
        return max;
    }
}