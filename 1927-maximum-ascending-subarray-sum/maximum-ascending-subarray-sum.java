class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = nums[0];
        for(int i = 1; i<nums.length; i++ ){
            if(nums[i-1] < nums[i]){
                sum += nums[i];
            }else{
                max = Math.max(sum , max);
                sum = nums[i];
            }
        }
        return Math.max(sum, max);
    }
}