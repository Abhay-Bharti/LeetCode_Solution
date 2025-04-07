class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) == k ){
                    String a = nums[i] + " " + nums[j];
                    String b = nums[j] + " " + nums[i];
                    if(!set.contains(a) && !set.contains(b)){
                        set.add(a);
                        set.add(b);
                        count++;
                    }
                }
            }
        }
        System.out.println(set);
        return count;
    }
}