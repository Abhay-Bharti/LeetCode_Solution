class Solution {
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i = i + k) {
            if (i + k > s.length()) {
                arr.add(s.substring(i));
                break;
            }
            arr.add(s.substring(i, i + k));
        }

        String last = arr.get(arr.size() - 1);
        if (last.length() < k) {
            while (last.length() != k) {
                last += fill;
            }
        }

        arr.set(arr.size() - 1, last);
        return arr.toArray(new String[0]);
    }
}