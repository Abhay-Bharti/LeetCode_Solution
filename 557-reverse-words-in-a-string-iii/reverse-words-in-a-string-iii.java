class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for(int i = 0; i<arr.length; i++){
            StringBuilder st = new StringBuilder(arr[i]);
            arr[i] = st.reverse().toString();
        }
        return String.join(" ", arr);
    }
}