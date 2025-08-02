class Solution {
    public int minDeletion(String s, int k) {

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        List<Integer> freqList = new ArrayList<>(freqMap.values());
        Collections.sort(freqList);

        int deletions = 0;
        int n = freqList.size();
        for (int i = 0; n > k && i < freqList.size(); i++, n--) {
            deletions += freqList.get(i);
        }

        return deletions;
    }
}
