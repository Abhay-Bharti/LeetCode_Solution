class Solution {
    public int maxFreqSum(String s) {
        int m1 = 0, m2 = 0;
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (freq[ch - 'a'] > m1) {
                    m1 = freq[ch - 'a'];
                }
            } else if (freq[ch - 'a'] > m2) {
                m2 = freq[ch - 'a'];
            }
        }

        return m1 + m2;
    }
}