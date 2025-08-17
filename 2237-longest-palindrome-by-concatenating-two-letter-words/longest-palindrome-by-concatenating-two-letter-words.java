class Solution {
    public int longestPalindrome(String[] words) {
        int res = 0, isValid = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : words)
            map.put(s, map.getOrDefault(s, 0) + 1);

        for (int i = 0; i < words.length; i++) {
            String temp = "" + words[i].charAt(1) + words[i].charAt(0);

            if(temp.equals(words[i])){
                if( map.containsKey(temp)){
                    int n = map.get(temp) / 2;
                    if(map.get(temp) % 2 == 0){
                        map.remove(temp);
                    }else{
                        if(isValid == 0){
                            isValid = 1;
                            res += 2;
                        }
                        map.put(temp, 1);
                    }
                    res += n*4;
                }
                continue;
            }

            if(map.containsKey(temp) && map.containsKey(words[i])){
                if(map.get(temp) == 1){
                    map.remove(temp);
                }else{
                    map.put(temp, map.get(temp) - 1);
                }
                if(map.get(words[i]) == 1){
                    map.remove(words[i]);
                }else{
                    map.put(words[i], map.get(words[i]) - 1);
                }

                res += 4;
            }
        }
        
        return res;
    }
}