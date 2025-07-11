class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int res = maxWeight/w, cell = n*n;
        return cell > res ? res : cell;
    }
}