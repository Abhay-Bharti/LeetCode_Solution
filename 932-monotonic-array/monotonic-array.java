class Solution {
    public boolean isMonotonic(int[] nums) {
        int parity = -1;

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1] ){
                if(parity == -1){
                    parity = 1;
                    continue;
                }else if(parity != 1){
                    return false;
                }
            }else if(nums[i] < nums[i+1]){
                if(parity == -1){
                    parity = 0;
                    continue;
                }else if(parity != 0){
                    return false;
                }
            }
        }
        return true;
    }
}