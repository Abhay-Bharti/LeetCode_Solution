class Solution {
    public boolean isBalanced(String num) {
        int s1 = 0, s2 = 0;
        for(int i = 0; i<num.length(); i++ ){
            if(i%2 == 0){
                s1 += num.charAt(i) - '0';
            }else{
                s2 += num.charAt(i) - '0';
            }
        }
        return s1 == s2;
    }
}