class Solution {
    public boolean detectCapitalUse(String word) {
        String a = word.toLowerCase();
        String b = word.toUpperCase();
        String c = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();

        if(word.equals(a) || word.equals(b) || word.equals(c) ){
            return true;
        }
        return false;
    }
}