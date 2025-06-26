class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0, left = 0;

        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if(map.get(nums[i]) > k){
                while(map.get(nums[i]) > k){
                    if(map.get(nums[left]) == 1){
                        map.remove(nums[left]);
                        left++;
                    }else{
                        map.put(nums[left], map.get(nums[left])-1);
                        left++;
                    }
                }
            }
            len = Math.max(len, (i - left + 1));
        }

        return len;
    }
}