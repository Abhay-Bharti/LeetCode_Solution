class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while(word.length() <= k){
            int len = word.length();
            for(int i = 0; i<len; i++){
                if(word.charAt(i) != 'z'){
                    word.append((char)(word.charAt(i) + 1));
                }else{
                    word.append('a');
                }
            }
        }
        
        return word.charAt(k-1);
    }
}