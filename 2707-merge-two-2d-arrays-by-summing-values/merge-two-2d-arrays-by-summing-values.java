class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        int a = 0, b = 0;

        while (a < nums1.length && b < nums2.length) {
            if (nums1[a][0] == nums2[b][0]) {
                List<Integer> l = new ArrayList<>();
                l.add(nums2[b][0]);
                l.add(nums1[a][1] + nums2[b][1]);
                a++;
                b++;
                list.add(l);
            } else if (nums1[a][0] < nums2[b][0]) {
                List<Integer> l = new ArrayList<>();
                l.add(nums1[a][0]);
                l.add(nums1[a][1]);
                a++;
                list.add(l);
            } else if (nums1[a][0] > nums2[b][0]) {
                List<Integer> l = new ArrayList<>();
                l.add(nums2[b][0]);
                l.add(nums2[b][1]);
                b++;
                list.add(l);
            }
        }

        while (a < nums1.length) {
            List<Integer> l = new ArrayList<>();
            l.add(nums1[a][0]);
            l.add(nums1[a][1]);
            a++;
            list.add(l);
        }
        while (b < nums2.length) {
            List<Integer> l = new ArrayList<>();
            l.add(nums2[b][0]);
            l.add(nums2[b][1]);
            b++;
            list.add(l);
        }

        int[][] arr = new int[list.size()][2];
        for(int i = 0; i<list.size(); i++){
            arr[i][0] = list.get(i).get(0);
            arr[i][1] = list.get(i).get(1);
        }

        return arr;
    }
}