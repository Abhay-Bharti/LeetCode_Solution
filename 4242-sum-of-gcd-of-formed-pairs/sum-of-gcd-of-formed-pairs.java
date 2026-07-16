class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        long sum = 0;

        arr[0] = nums[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            max = nums[i] < max ? max : nums[i];
            arr[i] = gcd(max, nums[i]);
            // System.out.printf("%d, %d\n", max, arr[i]);
        }
        
        Arrays.sort(arr);
        // System.out.println();
        for(int i = 0; i < n/2; i++){
            sum += (long) gcd(arr[i], arr[n-i-1]);
            // System.out.println(sum);
        }

        return sum;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}