class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        if(n == 0){
            return true;
        }
        if(f.length == 1){
            if(f[0] == 0 && n == 1){
                return true;
            }else {
                return false;
            }
        }
        for (int i = 0; i < f.length; i++) {
            if (f[i] == 0) {
                if(i == 0 && f[i+1] == 0){
                    f[i] = 1;
                    n--;
                }else if(i == f.length-1 && f[i-1] == 0){
                    f[i] = 1;
                    n--;
                }
                else if (i > 0 && f[i - 1] == 0) {
                    if (i < f.length - 1 && f[i + 1] == 0) {
                        f[i] = 1;
                        n--;
                    }
                }
            }
        }
        if (n <= 0) {
            return true;
        }
        return false;
    }
}
