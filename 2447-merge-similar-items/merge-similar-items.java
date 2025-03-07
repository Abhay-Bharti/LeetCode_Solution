class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(items1, Comparator.comparingDouble(o -> o[0]));
        Arrays.sort(items2, Comparator.comparingDouble(o -> o[0]));

        int a = 0, b = 0;
        while(a < items1.length && b < items2.length){
            
            if(items1[a][0] == items2[b][0]){
                res.add(Arrays.asList(items1[a][0] , items1[a][1]+items2[b][1]));
                a++;
                b++;
            }else if(items1[a][0] < items2[b][0]){
                res.add(Arrays.asList(items1[a][0], items1[a][1]));
                a++;
            }else{
                res.add(Arrays.asList(items2[b][0], items2[b][1]));
                b++;
            }
        }

        while(a<items1.length){
                res.add(Arrays.asList(items1[a][0], items1[a][1]));
                a++;
        }
        while(b<items2.length){
                res.add(Arrays.asList(items2[b][0], items2[b][1]));
                b++;
        }
        return res;
    }
}