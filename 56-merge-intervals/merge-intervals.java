class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();
        list.add(intervals[0]);

        for(int i = 1; i<intervals.length; i++){
            int[] prev = list.get(list.size()-1);
            if(prev[1] >= intervals[i][0]){
                list.remove(list.size()-1);
                int end = Math.max(prev[1], intervals[i][1]);
                list.add(new int[]{prev[0], end});
            }else{
                list.add(intervals[i]);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}