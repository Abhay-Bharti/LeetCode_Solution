class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = s.length()-1; i>=0 ; i--){
            map.putIfAbsent(s.charAt(i), i);        
        }

        List<Integer> list = new ArrayList<>();
        int temp = 0, last = -1;

        for(int i = 0; i<s.length(); i++){
            temp = temp > map.get(s.charAt(i)) ? temp : map.get(s.charAt(i));
            if(temp == i){
                list.add( i - last);
                last = i;
                temp = i+1;
            }
        }

        return list;
    }
}