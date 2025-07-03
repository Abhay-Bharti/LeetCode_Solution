class Solution {
    public char kthCharacter(int k) {
        String bit = Integer.toBinaryString(k - 1);
        int count = 0;
        for (char c : bit.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        return (char)('a' + count);
    }
}