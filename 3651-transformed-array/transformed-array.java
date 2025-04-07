class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                res[i] = 0;
            }else if(nums[i] > 0){
                int a = i;
                int k = nums[i];
                while(k-- > 0){
                    if(a == n-1){
                        a = 0;
                    }else{
                        a++;
                    }
                }
                res[i] = nums[a];
            }else if(nums[i] < 0){
                int a = i;
                int k = Math.abs(nums[i]);
                while(k-- > 0){
                    if(a == 0){
                        a = n-1;
                    }else{
                        a--;
                    }
                }
                res[i] = nums[a];
            }
        }
        return res;
    }
}