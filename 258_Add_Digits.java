class Solution {
    public int addDigits(int num) {
        int sum = sum(num) ;
        while(sum > 9){
            sum = sum(sum);
        }
        return sum;
    }

    public int sum(int num){
        int sum = 0;
        while(num != 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}