class Solution {
    public List<String> stringSequence(String target) {
        List<String> list = new ArrayList<>();
        int i = 0;

        String res = "a";
        while (i < target.length()) {
            while (!res.equals(target.substring(0, i+1))) {
                list.add(res);
                int n = res.charAt(res.length() - 1) + 1;
                int val = n < 122 ? n : 95;
                res = res.substring(0, i) + (char) n;
            }
            list.add(res);
            res += "a";
            i++;
        }
        return list;
    }
}