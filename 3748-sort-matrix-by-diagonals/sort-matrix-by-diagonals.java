class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        if (n == 1) {
            return grid;
        }

        int col = n - 2, row = 0;

        while (col != 0) {
            ArrayList<Integer> list = new ArrayList<>();
            int i = row, j = col, k = 0;

            while (j != n && i != n) {
                list.add(grid[i][j]);
                i++;
                j++;
            }

            Collections.sort(list);

            i = row;
            j = col;
            System.out.println(list);
            while (j != n && i != n) {
                grid[i][j] = list.get(k);
                i++;
                j++;
                k++;
            }

            col--;
        }

        col = 0;
        row = 0;

        while (row != n - 1) {
            ArrayList<Integer> list = new ArrayList<>();
            int i = row, j = col, k = 0;

            while (j != n && i != n) {
                list.add(grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(list, Comparator.reverseOrder());

            i = row;
            j = col;

            while (j != n && i != n) {
                grid[i][j] = list.get(k);
                i++;
                j++;
                k++;
            }

            row++;
        }

        return grid;

    }
}