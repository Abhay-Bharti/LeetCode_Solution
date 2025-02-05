class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int[] arr = new int[queries.length];

        for(int i = 0; i<queries.length; i++ ){
            int a = queries[i][0];
            int b = queries[i][1];
            
            int ans = 0;
            while(a != b){
                if(a>b){
                    a = a/2;
                    ans++;
                }else if(a<b){
                    b = b/2;
                    ans++;
                }
            }

            arr[i] = ans+1;
        }
        return arr;
    }
}