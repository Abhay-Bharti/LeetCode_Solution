class Solution {
    public long countVowels(String word) {
        long ans = 0;
        int n = word.length();
        HashSet<Character> v = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);

            if (v.contains(ch)) {
                long val = (long) (n - i) * (i + 1);
                ans = ans + val;
            }
        }
        return ans;
    }
}