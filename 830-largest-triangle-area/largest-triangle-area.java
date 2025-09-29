class Solution {
    public double largestTriangleArea(int[][] points) {
        double a = 0, b = 0, c = 0, maxArea = Integer.MIN_VALUE;

        for(int i = 0; i<points.length; i++){
            for(int j = i+1; j<points.length; j++){
                for(int k = j+1; k<points.length; k++){
                    a = Math.sqrt(Math.pow(points[j][0] - points[i][0], 2) + Math.pow(points[j][1] - points[i][1], 2));
                    b = Math.sqrt(Math.pow(points[k][0] - points[j][0], 2) + Math.pow(points[k][1] - points[j][1], 2));
                    c = Math.sqrt(Math.pow(points[i][0] - points[k][0], 2) + Math.pow(points[i][1] - points[k][1], 2));

                    if(a + b > c && b + c > a && c + a > b){
                        double s = (a+b+c)/2;
                        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                        maxArea = Math.max(area, maxArea);
                    }
                }
            }
        }
        return maxArea;
    }
}