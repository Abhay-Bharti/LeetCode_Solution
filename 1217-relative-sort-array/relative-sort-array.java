class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i: arr1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        System.out.println(map);
        int j = 0;
        for(int i = 0; i<arr2.length; i++){
            int n = map.get(arr2[i]);
            while(n > 0){
                arr1[j] = arr2[i];
                j++;
                n--;
            }
            map.remove(arr2[i]);
        }

        for(int i: map.keySet()){
            int n = map.get(i);
            while(n > 0){
            arr1[j] = i;
            j++;
            n--;
            }
        }
        return arr1;
    }
}