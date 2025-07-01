class Solution {
    public int possibleStringCount(String word) {
        int count = 0;

        for (int i = 0; i < word.length() - 1; i++) {
            int j = i + 1;

            while (j < word.length() && word.charAt(i) == word.charAt(j)) {
                count++;
                j++;
            }
            i = j - 1;
        }

        return count + 1;
    }
}