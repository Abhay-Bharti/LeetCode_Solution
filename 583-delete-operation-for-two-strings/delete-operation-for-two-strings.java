class Solution {
    public int minDistance(String word1, String word2) {
        if(word1.equals(word2)){
            return 0;
        }

        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n+1][m+1];

        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= m; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return (word1.length() - dp[n][m]) + (word2.length() - dp[n][m]);
    }
}