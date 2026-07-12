class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0){
            return new int[0];
        }

        int[] cpy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(cpy);

        HashMap<Integer, Integer> map = new HashMap<>();
        int r = 1;
        map.put(cpy[0], r);
        for(int i = 1; i<cpy.length; i++){
            if(cpy[i] == cpy[i-1])
                continue;
            r++;
            map.put(cpy[i], r);
        }

        int[] rank = new int[arr.length];
        for(int i = 0; i<rank.length; i++){
            rank[i] = map.get(arr[i]);
        }

        return rank;
    }
}