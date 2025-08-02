class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> a.getValue() - b.getValue());

        Map<Character, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Character, Integer> entry: list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        int count = 0;
        Iterator<Map.Entry<Character, Integer>> it = sortedMap.entrySet().iterator();

        while(sortedMap.size() > k && it.hasNext()){
            Map.Entry<Character, Integer> entry = it.next();
            count += entry.getValue();
            it.remove();
        }

        return count;
    }
}