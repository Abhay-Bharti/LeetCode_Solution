class Solution {
    public int maxDiff(int num) {
        String n = String.valueOf(num);
        int i = 0;

        while (i < n.length()-1 && n.charAt(i) == '9') {
            i++;
        }

        String a = n.replaceAll(String.valueOf(n.charAt(i)), "9");
        i = 0;
        while (i < n.length()-1 && (n.charAt(i) == '1' || n.charAt(i) == '0')) {
            i++;
        }

        
        String b = ( i == 0 || n.charAt(i) == '1') ? n.replaceAll(String.valueOf(n.charAt(i)), "1") : n.replaceAll(String.valueOf(n.charAt(i)), "0");

        return Integer.parseInt(a) - Integer.parseInt(b);
    }
}