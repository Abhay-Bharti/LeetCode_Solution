class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] freq = new char[26];

        for(char ch : magazine.toCharArray()){
            freq[ch-'a']++;
        }

        for(char ch : ransomNote.toCharArray()){
            if(freq[ch-'a'] == 0){
                return false;
            }else{
                freq[ch-'a']--;
            }
        }

        return true;
    }
}