class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0, l = 0, r = 0;

        while (r < fruits.length) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            if (map.size() > 2) {
                if (map.get(fruits[l]) == 1) {
                    map.remove(fruits[l]);
                } else {
                    map.put(fruits[l], map.get(fruits[l]) - 1);
                }
                l++;
            }
            if(map.size() <= 2)
                maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }
}