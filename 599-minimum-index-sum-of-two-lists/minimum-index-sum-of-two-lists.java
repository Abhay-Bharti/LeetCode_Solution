class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int sum = Integer.MAX_VALUE;
        ArrayList<String> res = new ArrayList<>();

        for(int i = 0; i<list1.length; i++){
            for(int j = 0; j<list2.length; j++){
                if(list1[i].equals(list2[j])){
                    if(i+j < sum){
                        sum = i+j;
                        res.clear();
                        res.add(list1[i]);
                        break;
                    }else if(i+j == sum){
                        res.add(list1[i]);
                        break;
                    }
                }
            }
        }
        
        String[] ans = new String[res.size()];
        for(int i = 0; i<res.size(); i++){
            ans[i] = res.get(i);
        }

        return ans;
    }
}