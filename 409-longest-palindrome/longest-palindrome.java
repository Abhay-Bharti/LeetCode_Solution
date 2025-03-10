class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int count = 0;
        boolean one = false;
        boolean c = false;
        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                one = true;
            } else {
                if (!c && map.get(key) % 2 != 0) {
                    count += map.get(key);
                    c = true;
                } else {
                    count += (map.get(key) / 2) * 2;
                }
            }
        }
        if ((one && !c)) {
            count++;
        }
        return count;
    }
}