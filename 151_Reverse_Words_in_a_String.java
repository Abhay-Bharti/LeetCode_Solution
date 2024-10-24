class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String str = "";

        for(int i = 0; i<arr.length/2; i++){
            String temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        for(String i: arr){
            if(i == " " || i==""){
                continue;
            }else {
                str += i + " ";
            }
        }
        str = str.trim();
        return str;
    }
}