class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = -1;
        double maxd = -1;

        for (int i = 0; i < dimensions.length; i++) {
            int l = dimensions[i][0], w = dimensions[i][1];

            double diagonal = Math.sqrt(l * l + w * w);
            if (maxd < diagonal) {
                maxd = diagonal;
                max =  l * w;
            }else if(maxd == diagonal){
                max = Math.max(max, (l*w));
            }
        }

        return max;
    }
}