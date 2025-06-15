class Solution {
    public int maximum69Number(int num) {
        String str = String.valueOf(num);
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '6') {
                ans = str.substring(0, i) + '9' + str.substring(i+1);
                break;
            }
        }

        if (ans == "") {
            return num;
        } else {
            return Integer.parseInt(ans);
        }
    }
}