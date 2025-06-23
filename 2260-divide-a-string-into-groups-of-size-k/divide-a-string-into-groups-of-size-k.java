class Solution {
    public String[] divideString(String s, int k, char fill) {
        int size = (int)Math.ceil((double)s.length() / k);
        String[] res = new String[size];
        int j = 0;

        for (int i = 0; i < s.length(); i = i + k) {
            if (i + k > s.length()) {
                String last = s.substring(i);
                while (last.length() != k) {
                    last += fill;
                }
                res[j++] = last;
                break;
            }
            res[j++] = s.substring(i, i + k);
        }

        return res;
    }
}