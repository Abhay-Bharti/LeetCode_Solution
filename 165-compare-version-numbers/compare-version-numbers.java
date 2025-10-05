class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int a = 0, b = 0;
        while(a < v1.length && b < v2.length ){
            int i = Integer.parseInt(v1[a]);
            int j = Integer.parseInt(v2[b]);

            if(i < j){
                System.out.println(1);
                return -1;
            }else if(i > j){
                return 1;
            }
            a++;
            b++;
        }

        if(a == v1.length && b == v2.length){
            return 0;
        }
        
        while(a < v1.length){
            if(Integer.parseInt(v1[a]) > 0){
                System.out.println(a);
                return 1;
            }
            a++;
        }

        while(b < v2.length){
            if(Integer.parseInt(v2[b]) > 0)
                return -1;
            b++;
        }
        
        return 0;
    }
}