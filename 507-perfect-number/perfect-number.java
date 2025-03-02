class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 1){
            return false;
        }
        
        int sum = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if ((num / i) == i) {
                    sum += i;                
                } else {
                    sum += (i + (int)(num / i));
                }
            }
        }
        sum += 1;
        return sum == num;
    }
}