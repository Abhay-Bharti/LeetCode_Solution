class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid.length; j++){
                if(set.contains(grid[i][j])){
                    res[0] = grid[i][j];
                }else{
                    set.add(grid[i][j]);
                }
            }
        }

        for(int i = 1; i<=grid.length*grid.length; i++){
            if(!set.contains(i)){
                res[1] = i;
                break;
            }
        }

        return res;
    }
}