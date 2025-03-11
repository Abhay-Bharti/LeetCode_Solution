class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        List<List<Integer>> res = new ArrayList<>();
        
        for(int i: nums1){
            set1.add(i);
        }
        for(int i: nums2){
            set2.add(i);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i: nums1){
            if(!set2.contains(i)){
                set.add(i);
            }
        }
        res.add(new ArrayList<>(set));
        set.clear();
        for(int i: nums2){
            if(!set1.contains(i)){
                set.add(i);
            }
        }
        res.add(new ArrayList<>(set));

        return res;
    }
}