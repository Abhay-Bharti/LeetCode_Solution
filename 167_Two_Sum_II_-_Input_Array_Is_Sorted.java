class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length-1;
        int[] pos = new int[2];

        while(s<e){
            int sum = numbers[s]+numbers[e];
            if( sum == target){
                pos[0] = s+1;
                pos[1] = e+1;
                return pos;
            }
            if( sum<=target){
                s++;
            }else {
                e--;
            }
        }
        return pos;
    }
}