class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        List<String> arr = getArray(paragraph);
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        }

        System.out.println(arr);
        System.out.println(map);
        int max = -1;
        String ans = "";

        for (String s : banned) {
            if (map.containsKey(s)) {
                map.remove(s);
            }
        }
        System.out.println(map);

        for (String s : map.keySet()) {
            if (map.get(s) > max) {
                max = map.get(s);
                ans = s;
            }
        }

        return ans;
    }

    public List<String> getArray(String s) {
        List<String> arr = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isAlphabetic(c)) {
                sb.append(c);
            } else {
                if (sb.length() != 0) {
                    arr.add(sb.toString().toLowerCase());
                    sb.delete(0, sb.length());
                }
            }
        }

        if (sb.length() != 0)
            arr.add(sb.toString().toLowerCase());

        return arr;
    }
}