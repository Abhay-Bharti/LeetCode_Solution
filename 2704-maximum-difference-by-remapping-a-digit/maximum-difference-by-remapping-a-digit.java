class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);
        String maxStr = str;
        String minStr = str;

        char maxCharToReplace = ' ';
        for (char c : str.toCharArray()) {
            if (c != '9') {
                maxCharToReplace = c;
                break;
            }
        }
        if (maxCharToReplace != ' ') {
            maxStr = str.replaceAll(String.valueOf(maxCharToReplace), "9");
        }

        char minCharToReplace = ' ';
        for (char c : str.toCharArray()) {
            if (c != '0') {
                minCharToReplace = c;
                break;
            }
        }
        if (minCharToReplace != ' ') {
            minStr = str.replaceAll(String.valueOf(minCharToReplace), "0");
        }

        int max = Integer.parseInt(maxStr);
        int min = Integer.parseInt(minStr);

        return max - min;
    }
}