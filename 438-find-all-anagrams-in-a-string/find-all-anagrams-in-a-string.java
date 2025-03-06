class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        char[] ps = p.toCharArray();
        Arrays.sort(ps);

        for(int i = 0; i<(s.length()-p.length()+1); i++){
            char[] st = s.substring(i, i+p.length()).toCharArray();
            Arrays.sort(st);

            if(Arrays.equals(st, ps)) list.add(i);
        }
        return list;
    }
}