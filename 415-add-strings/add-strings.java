class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int a = num1.length() - 1, b = num2.length() - 1;
        int carry = 0;
        while (a >= 0 && b >= 0) {
            int num = num1.charAt(a) - '0' + num2.charAt(b) - '0' + carry;
            sb.append(num % 10);
            carry = num / 10;
            a--;
            b--;
        }
        while (a >= 0) {
            int num = num1.charAt(a) - '0' + carry;
            sb.append(num % 10);
            carry = num / 10;
            a--;
        }
        while (b >= 0) {
            int num = num2.charAt(b) - '0' + carry;
            sb.append(num % 10);
            carry = num / 10;
            b--;
        }
        if(carry > 0){
            sb.append(carry);
        }

        return sb.reverse().toString();

    }
}