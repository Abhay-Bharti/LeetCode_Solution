class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        
        for(int i: nums){
            set.add(i);
        }

        if(set.size() == 1){
            return n*(n+1)/2;
        }

        HashSet<Integer> temp = new HashSet<>();
        int count = 0;

        for(int i = -1; i < nums.length - 1; i++ ){
            temp.clear();
            for(int j = i+1; j<nums.length; j++){
                temp.add(nums[j]);
                if(temp.size() == set.size())
                    count++;
            }
        }

        return count;
    }
}