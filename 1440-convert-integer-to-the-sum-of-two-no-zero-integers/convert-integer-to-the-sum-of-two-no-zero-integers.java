class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i = 1 ; i<n; i++){
            if(nonZero(i) && nonZero(n-i)){
                return new int[]{i, n-i};
            }
        }
        return new int[]{0,0};
    }

    private boolean nonZero(int n){
        while(n>0){
            int rem = n%10;
            if(rem == 0) return false;
            n /= 10;
        }
        return true;
    }
}