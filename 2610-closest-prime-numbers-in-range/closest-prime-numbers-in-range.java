class Solution {
    public int[] closestPrimes(int left, int right) {
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i = left; i<=right; i++){
            if(prime(i)) list.add(i);
        }
        int[] res = {-1, -1};

        for(int i = 0; i<list.size()-1; i++){
            if(list.get(i+1) - list.get(i) < min){
                min = Math.min(min, list.get(i+1)-list.get(i));
                res[0] = list.get(i);
                res[1] = list.get(i+1);
            }
        }

        return res;
    }

    public boolean prime(int n){
        if(n <= 1) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;

        for(int i = 5; i<= Math.sqrt(n); i = i+6){
            if(n%i == 0 || n%(i+2) == 0) return false;
        }
        return true;
    }
}