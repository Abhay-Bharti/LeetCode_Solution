class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int r = cardPoints.length-1, lsum = 0, rsum = 0;

        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }

        int maxSum = lsum;

        for(int i = k-1; i>=0; i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[r];
            r--;

            maxSum = Math.max(maxSum, lsum+rsum);
        }

        return maxSum;
    }
}