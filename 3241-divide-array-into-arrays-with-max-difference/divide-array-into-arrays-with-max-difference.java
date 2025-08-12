class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length/3;
        int[][] ans = new int[n][3];
        int j = 0;

        for(int i = 0; i<nums.length; i+=3){
            if(i%3 == 0 && nums[i+2] - nums[i] > k)
                return new int[0][0];

            int[] arr = Arrays.copyOfRange(nums, i, i+3);
            ans[j] = arr;
            j++;
        }

        return ans;
    }
}