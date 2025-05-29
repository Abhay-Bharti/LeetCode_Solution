class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length <= 2){
            return -1;
        }

        int max = -1, min = -1, m = -1, n = 101;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > m ){
                max = i;
                m = nums[i];
            }
            if(nums[i] < n){
                min = i;
                n = nums[i];
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(i != max && i != min){
                return nums[i];
            }
        }

        return -1;
    }
}