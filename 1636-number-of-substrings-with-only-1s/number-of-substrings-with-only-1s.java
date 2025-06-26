class Solution {
    public int numSub(String s) {
        int n = 0, mod = (int)1e9+7, ans = 0;
        System.out.println(mod);

        for(char c: s.toCharArray()){
            if(c == '1'){
                n++;;
            }else{
                ans = (int)((ans + ((long)n * (n + 1) / 2) % mod) % mod);
                n = 0;
            }            
        }

        if(n != 0){
            ans = (int)((ans + ((long)n * (n + 1) / 2) % mod) % mod);
        }

        return ans;
    }
}