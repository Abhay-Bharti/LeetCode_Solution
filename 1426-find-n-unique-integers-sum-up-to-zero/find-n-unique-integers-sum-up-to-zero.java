class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int s = -(n/2);

        for(int i = 0; i<n; i++){
            if(n%2 == 0 && s == 0){
                s++;
            }
            ans[i] = s;
            s++;
        }

        return ans;
    }
}