class Solution {
    public boolean isPerfectSquare(int num) {

        int s = 0, e = num;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            long square = (long) mid * mid;
            if (square == num) {
                return true;
            } else if (square > num) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    }
}