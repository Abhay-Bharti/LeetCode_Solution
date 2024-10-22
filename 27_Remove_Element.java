
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int j = 0;
        int[] arr = new int[nums.length];

        for(int i = 0; i<nums.length; i++ ){
            if(nums[i] == val){ 
                count++;
            }else {
            arr[j] = nums[i];
            j++;
            }
        }

        for(int i = 0; i<arr.length; i++ ){
            nums[i] = arr[i];
        }

        return arr.length-count;
    }
}