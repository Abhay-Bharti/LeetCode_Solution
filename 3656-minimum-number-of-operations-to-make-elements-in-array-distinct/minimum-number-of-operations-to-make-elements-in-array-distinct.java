class Solution {
    public int minimumOperations(int[] nums) {
        int[] arr = new int[101];

        int i = nums.length-1;
        while( i >= 0){
            if(arr[nums[i]] != 0){
                break;
            }else{
                arr[nums[i]]++;
            }
            i--;
        }

        if(i == -1){
            return 0;
        }

        return (i+1) % 3 == 0 ? (i+1)/3 : (i+1)/3 + 1;

    }
}