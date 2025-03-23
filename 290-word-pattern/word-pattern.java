class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        HashSet<String> set = new HashSet<>();
        if (pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);

            if (!map.containsKey(ch)) {
                if(set.contains(arr[i])){
                    return false;
                }
                map.put(ch, arr[i]);
                set.add(arr[i]);
            } else if (!map.get(ch).equals(arr[i])) {
                return false;
            }

        }
        return true;
    }
}