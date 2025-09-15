class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int count = arr.length; 

        for(int i = 0; i<arr.length; i++){
            for(char c: arr[i].toCharArray()){
                if(brokenLetters.indexOf(c) >= 0){
                    count--;
                    break;
                }
            }
        }

        return count;
    }
}