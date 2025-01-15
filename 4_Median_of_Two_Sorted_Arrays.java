class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        int i = 0, j = 0, k = 0;
        while (i != nums1.length && j != nums2.length) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
                k++;
            } else {
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i != nums1.length) {
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while (j != nums2.length) {
            arr[k] = nums2[j];
            j++;
            k++;
        }

        int mid = n / 2;
        if (n % 2 == 0) {
            double res = (double) (arr[mid] + arr[mid - 1]) / 2;
            return res;
        } else {
            return (double) arr[mid];
        }
    }
}