class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = -Double.MAX_VALUE;
        int l = 0, r = k, sum = 0;

        for(int i = 0; i<k; i++){
            sum += nums[i];
        }

        avg = Math.max(avg, (double)sum/k);

        while(r < nums.length){
            sum -= nums[l];
            sum += nums[r];

            avg = Math.max(avg, (double)sum/k);
            System.out.println(avg);
            l++;
            r++;
        }

        return avg;
    }
}