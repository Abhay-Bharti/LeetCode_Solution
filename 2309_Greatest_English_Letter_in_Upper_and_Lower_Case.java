class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        char ch = '\0';

        for (char c : set) {
            if (set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c))) {
                if (Character.compare(Character.toUpperCase(c), ch) > 0) {
                    ch = Character.toUpperCase(c);
                }
            }
        }

        return ch == '\0' ? "" : String.valueOf(ch);
    }
}