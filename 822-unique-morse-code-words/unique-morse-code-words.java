class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String temp = "";

            for (int j = 0; j < words[i].length(); j++) {
                temp += morse[words[i].charAt(j) - 'a'];
            }

            if (!set.contains(temp)) {
                set.add(temp);
                count++;
            }
        }

        return count;
    }
}