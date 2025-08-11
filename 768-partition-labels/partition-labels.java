class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] freq = new int[26];

        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)-'a'] = i;
        }

        List<Integer> list = new ArrayList<>();
        int temp = 0, last = -1;

        for(int i = 0; i<s.length(); i++){
            temp = temp > freq[s.charAt(i)-'a'] ? temp : freq[s.charAt(i)-'a'];
            if(temp == i){
                list.add( i - last);
                last = i;
                temp = i+1;
            }
        }

        return list;
    }
}