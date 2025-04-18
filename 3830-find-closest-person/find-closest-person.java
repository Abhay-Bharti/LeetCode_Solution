class Solution {
    public int findClosest(int x, int y, int z) {
        int b = Math.abs(x - z);
        int a = Math.abs(z - y);

        if (a == b)
            return 0;

        return a < b ? 2 : 1;

    }
}