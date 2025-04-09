class Solution {
    public int minOperations(int[] nums, int k) {
        int[] val = new int[101];
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            if(val[nums[i]] == 0 && nums[i] > k){
                count++;
                val[nums[i]]++;
            }else if(nums[i] < k){
                return -1;
            }
        }

        return  count;
    }
}