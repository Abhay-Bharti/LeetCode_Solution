class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        
        for(int i = 0; i<a1.length; i++ ){
            for(int j = i+1; j<a2.length; j++ ){
                if(a1[i] == a2[j] && a1[j] == a2[i] && a1[i] != a1[j]){
                    char swap = a1[i];
                    a1[i] = a1[j];
                    a1[j] = swap;
                    return Arrays.equals(a1, a2);
                }
            }
        }
        return false;
    }
}