class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i<s.length(); i++ ){
            for(int j = i; j<s.length(); j++ ){
                if(palindrome(s.substring(i, j+1)))
                    count++;
            }
        }

        return count;
    }

    static boolean palindrome(String s){
        StringBuilder st = new StringBuilder(s);
        return s.equals(st.reverse().toString());
    }
}