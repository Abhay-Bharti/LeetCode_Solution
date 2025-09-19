class Spreadsheet {
    int[][] sheet;

    public Spreadsheet(int rows) {
        this.sheet = new int[26][rows+1];
    }

    public void setCell(String cell, int value) {
        int[] pos = getCell(cell);
        sheet[pos[0]][pos[1]] = value;
    }

    public void resetCell(String cell) {
        int[] pos = getCell(cell);
        sheet[pos[0]][pos[1]] = 0;
    }

    public int getValue(String formula) {
        int a = 0, b = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : formula.toCharArray()) {
            if (c == '=')
                continue;
            if (c == '+') {
                if (sb.charAt(0) <= '9')
                    a = Integer.parseInt(sb.toString());
                else {
                    int[] pos = getCell(sb.toString());
                    a = sheet[pos[0]][pos[1]];
                }
                sb.setLength(0);
                continue;
            }
            sb.append(c);
        }

        if (sb.charAt(0) <= '9')
            b = Integer.parseInt(sb.toString());
        else {
            int[] pos = getCell(sb.toString());
            b = sheet[pos[0]][pos[1]];
        }

        return a + b;
    }

    private int[] getCell(String cell) {
        int i = cell.charAt(0) - 'A';
        int j = Integer.parseInt(cell.substring(1));
        return new int[] { i, j };
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */