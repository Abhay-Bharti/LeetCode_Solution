class Solution {
    private boolean isPrefixAndSuffix(String a, String b){
        return b.startsWith(a) && b.endsWith(a);
    }
    
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        
        for(int i = 0; i<words.length; i++){
            for(int j = i+1; j<words.length; j++){
                if(isPrefixAndSuffix(words[i], words[j])){
                    count++;
                }
            }
        }

        return count;
    }
}