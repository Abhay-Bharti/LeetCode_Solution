class Solution {
    public int maxFreqSum(String s) {
        char vowel, conso;
        int a = 0, b = 0;
        String v = "aeoiou";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
            
            if( v.indexOf(c) >= 0 && map.get(c) > a){
                vowel = c;
                a = map.get(c);
            }else if( v.indexOf(c) < 0 && map.get(c) > b ){
                conso = c;
                b = map.get(c);
            }
        }

        return a+b;
    }
}