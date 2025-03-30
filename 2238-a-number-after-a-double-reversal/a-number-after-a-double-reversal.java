class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0){
            return true;
        }
        String s = String.valueOf(num);
        if (s.charAt(s.length() - 1) == '0')
            return false;

        return true;

    }
}