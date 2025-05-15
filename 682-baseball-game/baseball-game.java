class Solution {
    public int calPoints(String[] operations) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i<operations.length; i++){
            String ch = operations[i];

            if(ch.equals("C")){
                res.remove(res.size()-1);
            }else if(ch.equals("D")){
                res.add(2*res.get(res.size()-1));
            }else if(ch.equals("+")){
                res.add(res.get(res.size()-1) + res.get(res.size()-2));
            }else{
                res.add(Integer.parseInt(ch));
            }
        }

        int sum = 0;
        for(int i : res){
            sum += i;
        }
        return sum;
    }
}