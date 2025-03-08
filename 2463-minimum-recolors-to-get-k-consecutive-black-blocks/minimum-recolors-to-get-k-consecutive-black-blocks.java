class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<blocks.length()-k+1; i++){
            int count = 0;            
            String st = blocks.substring(i, i+k);
            for(int j = 0; j<st.length(); j++){
                if(st.charAt(j) == 'W'){
                    count++;
                }
            }
            ans = Math.min(ans, count);
        }
        return ans;
    }
}