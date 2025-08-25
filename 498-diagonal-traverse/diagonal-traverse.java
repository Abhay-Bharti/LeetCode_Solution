class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        ArrayList<Integer> ans = new ArrayList<>();
        int row = 0, col = 0, m = mat.length, n = mat[0].length;

        while(row <  m && col < n){
            while(row >= 0 && col < n){
                ans.add(mat[row][col]);
                row--;
                col++;
            }

            if(row == -1 && col == n){
                row += 2;
                col--;              
            }else if(row == -1){
                row++;
            }else if(col == n){
                row+=2;
                col--;
            }

            if(row == m && col == n)
                break;

            while(col >= 0 && row < m){
                ans.add(mat[row][col]);
                row++;
                col--;
            }

            if(row == m && col == -1){
                row -= 1;
                col += 2;
            }else if(col == -1){
                col += 1;
            }else if(row == m){
                row -= 1;
                col += 2;
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}