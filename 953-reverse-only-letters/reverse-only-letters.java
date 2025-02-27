class Solution {
    public String reverseOnlyLetters(String s) {
        int f = 0, e = s.length() - 1;
        char[] arr = s.toCharArray();

        while (f < e) {
            if (Character.isAlphabetic(arr[f]) && Character.isAlphabetic(arr[e])) {
                char temp = arr[f];
                arr[f] = arr[e];
                arr[e] = temp;
                f++;
                e--;
            } else if (!Character.isAlphabetic(arr[f])) {
                f++;
            } else {
                e--;
            }
        }
        return new String(arr);
    }
}