class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int a = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < pivot){
                res[a] = nums[i];
                a++;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == pivot){
                res[a] = nums[i];
                a++;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > pivot){
                res[a] = nums[i];
                a++;
            }
        }
        return res;
    }
}