class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            map.put(list2[i], i);
        }

        int minsum = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            if (map.containsKey(list1[i])) {
                int sum = i + map.get(list1[i]);
                if (sum < minsum) {
                    minsum = sum;
                    res.clear();
                    res.add(list1[i]);
                } else if (minsum == sum) {
                    res.add(list1[i]);
                }
            }
        }

        return res.toArray(new String[0]);
    }
}