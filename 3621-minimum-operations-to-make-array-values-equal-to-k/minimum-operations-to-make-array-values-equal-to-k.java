class Solution {
    public int minOperations(int[] nums, int k) {
        boolean[] val = new boolean[101];
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            if(!val[nums[i]] && nums[i] > k){
                count++;
                val[nums[i]] = true;
            }else if(nums[i] < k){
                return -1;
            }
        }

        return  count;
    }
}