class Solution {
    public String removeOccurrences(String s, String part) {
        int first = Integer.MAX_VALUE;
        int n = part.length();
        for (int i = 0; i <= s.length() - n; i++) {
            char ch = s.charAt(i);
            if (ch == part.charAt(0)) {
                if (first > i) {
                    first = i;
                }
                if (s.substring(i, i + n).equals(part)) {
                    s = s.substring(0, i) + s.substring(i + n, s.length());
                    i = first - 1;
                }
            }
        }
        return s;
    }
}