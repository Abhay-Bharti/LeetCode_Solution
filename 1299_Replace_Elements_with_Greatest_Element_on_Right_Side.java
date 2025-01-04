class Solution {
    public int[] replaceElements(int[] arr) {
        int[] max = new int[arr.length];
        max[arr.length - 1] = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            max[i] = Math.max(arr[i + 1], max[i + 1]);
        }

        max[arr.length - 1] = -1;

        return max;
    }
}