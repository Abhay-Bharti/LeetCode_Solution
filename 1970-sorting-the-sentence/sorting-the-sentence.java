class Solution {
    public String sortSentence(String s) {
        String[] ar = s.split(" ");
        String[] res = new String[ar.length];

        for(String i: ar){
            res[(i.charAt(i.length()-1) - '0')-1] = i.substring(0, i.length()-1);
        }

        String ans = String.join(" ", res);
        return ans;
    }
}