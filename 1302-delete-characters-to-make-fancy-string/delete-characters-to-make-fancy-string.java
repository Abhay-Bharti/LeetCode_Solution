class Solution {
    public String makeFancyString(String s) {
        if (s.length() < 3) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 1, j = i + 1;

            while (j < s.length() && s.charAt(j) == ch) {
                count++;
                j++;
            }
            if (count > 1) {
                sb.append(ch);
            }
            sb.append(ch);
            i = j - 1;
        }

        return sb.toString();
    }
}