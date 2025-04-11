class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low; i<= high; i++){
            String s = String.valueOf(i);
            if(s.length() % 2 != 0){
                continue;
            }else if(isValid(s))
                count++;
        }
        return count;
    }

    public boolean isValid(String s){
        int s1 = 0, s2 = 0, l = 0, r = s.length()-1;
        while(l<r){
            s1 += (int)s.charAt(l);
            s2 += (int)s.charAt(r);
            l++;
            r--;
        }

        return s1 == s2;
    }
}