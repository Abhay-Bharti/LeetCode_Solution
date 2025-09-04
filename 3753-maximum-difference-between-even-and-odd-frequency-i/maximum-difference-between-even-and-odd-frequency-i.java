class Solution {
    public int maxDifference(String s) {
        int odd = 0, even = Integer.MAX_VALUE;
        int[] freq = new int[26];

        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }

        for(int i = 0; i<26; i++){
            if(freq[i] != 0 && freq[i] % 2 == 0 && freq[i] < even){
                even = freq[i];
            }else if(freq[i] % 2 != 0 && freq[i] > odd){
                odd = freq[i];
            }
        }
        return odd - even;
    }
}