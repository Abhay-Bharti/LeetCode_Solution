class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }

        int vowelCount = 0, consonantCount = 0;
        String vowel = "aeiouAEIOU";

        for(char c: word.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                System.out.println("1" + c);
                return false;
            }
            if(vowel.indexOf(c) != -1){
                vowelCount++;
            }else if(Character.isAlphabetic(c)){
                System.out.println(c);
                consonantCount++;
            }
        }

        if(vowelCount == 0 || consonantCount == 0){
                System.out.println("2");
            return false;
        }

        return true;
    }
}