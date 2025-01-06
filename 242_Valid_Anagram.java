class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        int[] freq2 = new int[26];

        for (char a : s.toCharArray()) {
            freq[a - 'a']++;
        }

        for (char a : t.toCharArray()) {
            freq2[a - 'a']++;
        }

        return Arrays.equals(freq, freq2);

    }
}