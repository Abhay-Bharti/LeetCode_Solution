class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> ai = new ArrayList<>();

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    ai.add(i);
                    ai.add(j);
                }
            }
        }
        for(int i = 0; i<ai.size(); i = i+2){
            for(int r = 0; r<n; r++){
                matrix[ai.get(i)][r] = 0;
            }
            for(int c = 0; c<m; c++){
                matrix[c][ai.get(i+1)] = 0;
            }
        }
        System.out.println(ai);
    }
}