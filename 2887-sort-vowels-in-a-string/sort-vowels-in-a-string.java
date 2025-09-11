class Solution {
    public String sortVowels(String s) {
        int[] freq = new int[10];
        char[] map = {'A','E','I','O','U','a','e','i','o','u'};
        String vowel = "AEIOUaeiou";
        int idx = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch) {
                case 'A':
                    freq[0]++;
                    break;
                case 'E':
                    freq[1]++;
                    break;
                case 'I':
                    freq[2]++;
                    break;
                case 'O':
                    freq[3]++;
                    break;
                case 'U':
                    freq[4]++;
                    break;
                case 'a':
                    freq[5]++;
                    break;
                case 'e':
                    freq[6]++;
                    break;
                case 'i':
                    freq[7]++;
                    break;
                case 'o':
                    freq[8]++;
                    break;
                case 'u':
                    freq[9]++;
                    break;
            }
        }

        while (idx < 10 && freq[idx] == 0) {
            idx++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (vowel.indexOf(s.charAt(i)) > -1) {
                sb.append(map[idx]);
                freq[idx]--;
                while (idx < 10 && freq[idx] == 0) {
                    idx++;
                }
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}