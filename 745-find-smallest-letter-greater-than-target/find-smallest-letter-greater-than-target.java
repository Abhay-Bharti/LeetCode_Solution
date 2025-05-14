class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int[] comp = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        
        for(int i = 0; i<letters.length; i++){
            if(target < letters[i] && letters[i] < comp[1] && target != letters[i] ){
                comp[0] = i;
                comp[1] = letters[i];
            }
        }

        if(comp[0] == Integer.MAX_VALUE){
            return letters[0];
        }else{
            return (char)comp[1];
        }
    }
}