class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            min = nums[i] < min ? nums[i] : min;
            max = nums[i] > max ? nums[i] : max;
        }

        while(max != 0){
            int temp = max;
            max = min % max;
            min = temp;
        }

        return min;
    }
}