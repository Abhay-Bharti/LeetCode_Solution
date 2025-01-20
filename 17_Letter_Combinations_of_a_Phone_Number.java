class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        List<String> list = new ArrayList<>();

        HashMap<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        count(0, "", map, digits, list);
        return list;
    }

    static void count(int idx, String str, HashMap<String, String> map, String digits, List<String> list) {

        if (idx >= digits.length()) {
            list.add(str);
            return;
        }
        String val = map.get(String.valueOf(digits.charAt(idx)));

        for (int i = 0; i < val.length(); i++) {
            count(idx + 1, str + val.charAt(i), map, digits, list);
        }

    }
}