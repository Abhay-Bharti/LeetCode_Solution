class Solution {
    public int countSegments(String s) {
        if (s.equals("")) {
            return 0;
        }

        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
                count++;
            }
        }

        return s.charAt(0) != ' ' ? count + 1 : count;
    }
}