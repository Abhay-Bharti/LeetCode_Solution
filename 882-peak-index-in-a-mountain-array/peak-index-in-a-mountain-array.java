class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0, e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid > 0 && mid < arr.length - 1 && arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return s;
    }
}