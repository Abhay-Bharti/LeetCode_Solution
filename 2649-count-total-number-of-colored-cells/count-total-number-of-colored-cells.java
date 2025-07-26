class Solution {
    public long coloredCells(int n) {
        if(n == 1){
            return 1;
        }
        long res = 1;
        for(int i = 1; i < n; i++){
            res += 4*i;
        }

        return res;
    }
}